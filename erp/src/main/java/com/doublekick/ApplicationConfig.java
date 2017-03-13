package com.doublekick;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.ResourceUrlEncodingFilter;

import com.doublekick.util.PhPass;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@ComponentScan(basePackages = { "com.doublekick.controller", "com.doublekick.service" })
@EnableTransactionManagement(proxyTargetClass = true)
@EnableJpaRepositories(basePackages = "com.doublekick.repository")
@Import(value={DKSecurityConfigurer.class, AuthenticationConfiguration.class})
public class ApplicationConfig extends WebMvcConfigurerAdapter{

	Configure conf = Configure.getInstance();
	
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		VersionResourceResolver versionResourceResolver = new VersionResourceResolver()
//				.addVersionStrategy(new FixedStaticVersionStrategy(conf.build_version), "/**");
//		registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/").resourceChain(true)
//				.addResolver(versionResourceResolver);
//		registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/").resourceChain(true)
//				.addResolver(versionResourceResolver);
//		registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/static/").resourceChain(true)
//				.addResolver(versionResourceResolver);
//		super.addResourceHandlers(registry);
//	}
	
	@Bean
	public ResourceUrlEncodingFilter resourceUrlEncodingFilter() {
		return new ResourceUrlEncodingFilter();
	}

	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);
		registrationBean.setFilter(characterEncodingFilter);
		registrationBean.setFilter(new HiddenHttpMethodFilter());
		registrationBean.setFilter(new DKSiteMeshFilter());
		registrationBean.addUrlPatterns("/*");
		return registrationBean;
	}

	@Primary
	@Bean(name = "dataSource")
	public DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setInitialSize(10);
		ds.setMaxActive(50);
		ds.setMaxWait(10000);
		ds.setMinIdle(10);
		ds.setRemoveAbandoned(true);
		ds.setValidationQuery("select 1");
		ds.setTestWhileIdle(true);
		ds.setValidationQueryTimeout(1000);
		ds.setTimeBetweenEvictionRunsMillis(86400000);

		if (conf.db_driver.equals("com.mysql.jdbc.Driver")) {
			ds.setDriverClassName(conf.db_driver);
			ds.setUrl(conf.jdbc_url
					+ "/doublekick?useUnicode=true&charaterEncoding=utf8&zeroDateTimeBehavior=convertToNull");
			ds.setUsername(conf.db_username);
			ds.setPassword(conf.db_password);
		} else {
			ds.setDriverClassName("org.h2.Driver");
			ds.setUrl("jdbc:h2:file:./doublekick");
			ds.setUsername("sa");
			ds.setPassword("");
		}
		return ds;
	}

	@Bean
	JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setShowSql(conf.jpa_show_sql);
		adapter.setGenerateDdl(conf.jpa_generate_ddl);

		if (conf.db_driver.equals("com.mysql.jdbc.Driver")) {
			adapter.setDatabase(Database.MYSQL);
			adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
		} else {
			adapter.setDatabasePlatform("org.hibernate.dialect.H2Dialect");
			adapter.setDatabase(Database.H2);
		}
		return adapter;
	}

	@Bean(name = "entityManagerFactory")
	LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactoryBean.setDataSource(dataSource());
		entityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter());
		entityManagerFactoryBean.setPackagesToScan("com.doublekick.entity");

		Properties jpaProperties = new Properties();
		jpaProperties.put(AvailableSettings.SHOW_SQL, conf.jpa_show_sql);
		jpaProperties.put(AvailableSettings.HBM2DDL_AUTO, conf.jpa_ddl_auto);
		jpaProperties.put("hibernate.connection.characterEncoding", "utf8");
		jpaProperties.put("hibernate.connection.useUnicode", true);
		jpaProperties.put("hibernate.ejb.entitymanager_factory_name", "entityManagerFactory");
		entityManagerFactoryBean.setJpaProperties(jpaProperties);
		return entityManagerFactoryBean;
	}

	@Primary
	@Bean(name = "transactionManager")
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return txManager;
	}

	@Bean
	public DatabaseInit databaseInit() {
		return new DatabaseInit();
	}

	@Bean
	public PhPass phPass() {
		return new PhPass(8);
	}
	
//    @Bean
//    public MessageSource messageSource() {
//        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//        messageSource.setDefaultEncoding("UTF-8");
//        messageSource.setBasenames("locale/messages");
//        messageSource.setUseCodeAsDefaultMessage(true);
//        return messageSource;
//    }

}
