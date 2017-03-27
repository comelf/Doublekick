package com.doublekick.entity.academy;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Photo {
	private static final String DOT = ".";
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String originFileName;
	private String fileExt;
	private String saveDir;
	private String uuFileName;
	private String fullPath;
	private String uploadPath;
	private long fileSize;

	public Photo(String fileName, long size, String uploaPath) {
		this.uploadPath = uploaPath;
		this.originFileName = fileName;
		this.fileExt = getFileExt(fileName);
		// 저장경로(서버)
		this.saveDir = getFilePath();
		// 파일명 UUID화
		this.uuFileName = getRealFileName();
		// 저장경로 + 파일명(uuid)
		this.fullPath = saveDir + uuFileName + DOT + fileExt;
		this.fileSize = size;
	}
	

	private String getRealFileName() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		String today = formatter.format(new java.util.Date());
		return today + UUID.randomUUID().toString();
	}

	private String getFilePath() {
		String path = uploadPath + File.separator;
		File filePath = new File(path);
		if (!filePath.exists()) {
			filePath.mkdirs();
		}
		return path;
	}

	private String getFileExt(String filename) {
		String ext = filename.substring(filename.lastIndexOf(".")+1);
		return ext.toLowerCase();
	}
	
	public String getUrlPath() {
		return "/images/" + uuFileName + DOT + fileExt;
	}
	
	public String getSavePathAndFileName() {
		return saveDir + uuFileName + DOT + fileExt;
	}
	
	public String getFileNmae() {
		return uuFileName + DOT + fileExt;
	}

}
