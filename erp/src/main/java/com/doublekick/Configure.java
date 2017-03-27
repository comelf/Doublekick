package com.doublekick;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import com.doublekick.util.StringUtil;

public class Configure extends Thread {
	private static Configure instance = null;

	public final static synchronized Configure getInstance() {
		if (instance == null) {
			instance = new Configure();
			instance.setDaemon(true);
			instance.setName("Configure");
			instance.start();
		}
		return instance;
	}

	private Configure() {
		reload(true);
	}

	public String build_version;
	
	public int web_port = 8080;
	
	public String db_driver;
	public String jdbc_url;
	public String db_username;
	public String db_password;
	
	public String jpa_ddl_auto;
	public boolean jpa_show_sql;
	public boolean jpa_generate_ddl;
	
	public String image_path;
	
	
	private long last_load_time = -1;
	public Properties property = new Properties();
	private boolean running = true;

	public void run() {
		while (running) {
			reload(false);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
		}
	}

	public File getPropertyFile() {
		String home = System.getProperty("bw.server.home", ".");
		String s = System.getProperty("bw.server.config", "server.conf");
		return new File(home, s.trim());
	}

	long last_check = -1;

	public synchronized boolean reload(boolean force) {
		long now = System.currentTimeMillis();
		if (force == false && now < last_check + 3000)
			return false;
		last_check = now;
		File file = getPropertyFile();
		if (file.lastModified() == last_load_time) {
			return false;
		}
		last_load_time = file.lastModified();
		Properties temp = new Properties();
		if (file.canRead()) {
			FileInputStream in = null;
			try {
				in = new FileInputStream(file);
				temp.load(in);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if(in != null){
					try {
						in.close();
					} catch (IOException e) {
					}
				}
			}
		}
		property = replaceSysProp(temp);
		apply();
		return true;
	}

	private void apply() {
		this.build_version	= getValue("build_version", String.valueOf(new Date().getTime()));
		this.web_port		= getInt("web.port", 8080);
		
		this. db_driver	= getValue("db_driver", "org.h2.Driver");
		this. jdbc_url 		= getValue("jdbc_url", "jdbc_url=jdbc:mysql://127.0.0.1:3306");
		this. db_username = getValue("db_username", "doublekick");
		this. db_password	=	getValue("db_password", "d@ub1ekic&");
		
		this.jpa_ddl_auto = getValue("jpa_ddl_auto", "validate");
		this.jpa_show_sql = getBoolean("jpa_show_sql", false);
		this.jpa_generate_ddl	=getBoolean("jpa_generate_ddl", false);
		
		this.image_path = getValue("image_path",  System.getProperty("bw.server.home", ".") + "/images");
		
	}

	public String getValue(String key) {
		return StringUtil.trim(property.getProperty(key));
	}

	public String getValue(String key, String def) {
		return StringUtil.trim(property.getProperty(key, def));
	}

	public int getInt(String key, int def) {
		try {
			String v = getValue(key);
			if (v != null)
				return Integer.parseInt(v);
		} catch (Exception e) {
		}
		return def;
	}

	public long getLong(String key, long def) {
		try {
			String v = getValue(key);
			if (v != null)
				return Long.parseLong(v);
		} catch (Exception e) {
		}
		return def;
	}

	public boolean getBoolean(String key, boolean def) {
		try {
			String v = getValue(key);
			if (v != null)
				return Boolean.parseBoolean(v);
		} catch (Exception e) {
		}
		return def;
	}

	public String loadText() {
		File file = getPropertyFile();
		InputStream fin = null;
		try {
			fin = new FileInputStream(file);
			byte[] buff = readAll(fin);
			return new String(buff);
		} catch (Exception e) {
		} finally {
			if( fin != null){
				try {
					fin.close();
				} catch (IOException e) {
				}
			}
		}
		return null;
	}

	private byte[] readAll(InputStream fin) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			byte[] buff = new byte[4096];
			int n = fin.read(buff);
			while (n >= 0) {
				out.write(buff, 0 , n);
				n = fin.read(buff);
			}
		} catch (IOException e) {
		}
		return out.toByteArray();
	}

	public boolean saveText(String text) {
		File file = getPropertyFile();
		OutputStream out = null;
		try {
			out = new FileOutputStream(file);
			out.write(text.getBytes());
			return true;
		} catch (Exception e) {
		} finally {
			if( out != null){
				try {
					out.close();
				} catch (IOException e) {
				}
			}
		}
		return false;
	}
	
	private Properties replaceSysProp(Properties temp) {
		Properties p = new Properties();
		Map<Object, Object> args = new HashMap<Object, Object>();
		args.putAll(System.getenv());
		args.putAll(System.getProperties());
		p.putAll(args);
		Iterator<Object> itr = temp.keySet().iterator();
		while (itr.hasNext()) {
			String key = (String) itr.next();
			String value = (String) temp.get(key);
			p.put(key, StringUtil.trim(value));
		}
		return p;
	}
}
