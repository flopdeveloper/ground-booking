/**
 * 
 */
package com.boatload.cric.common.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author WIN10USER
 *
 */
public class CricketPropertyFile {

	String dbUrl = "";
	String dbUser = "";
	String dbPassword = "";
	String driverClassName = "";
	String minimumIdle = "";
	Long idleTimeout = 1L;
	String maxLifeTime = "";
	String propFileName = "application.properties";

	public CricketPropertyFile(int op) {
		try {
			if(op == 1) {
				this.getDBPropValue();
			}
		}catch(IOException exception) {
			
		}
	}
	
	public String getDriverClassName() {
		return driverClassName;
	}
	
	public String getDBUrl() {
		return dbUrl;
	}
	
	public String getDBUserName() {
		return dbUser;
	}
	
	public String getDBPassword() {
		return dbPassword;
	}
	
	public void setMinimumIdle(String minimumIdle) {
		this.minimumIdle = minimumIdle;
	}
	

	
	/**
	 * @return the idleTimeout
	 */
	public Long getIdleTimeout() {
		return idleTimeout;
	}

	/**
	 * @param idleTimeout the idleTimeout to set
	 */
	public void setIdleTimeout(Long idleTimeout) {
		this.idleTimeout = idleTimeout;
	}

	public void getDBPropValue() throws IOException{
		InputStream inputStream = null;
		Properties prop = null;
		try {
			prop = new Properties();
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			
			if(inputStream!=null) {
				prop.load(inputStream);
			}else {
				throw new FileNotFoundException("property file '"+ propFileName +"' not found in class path");
			}
			
			this.dbUrl = System.getenv("spring.datasource.url");
			this.dbUser = System.getenv("spring.datasource.username");
			this.dbPassword = System.getenv("spring.datasource.password");
			this.driverClassName = System.getenv("spring.datasource.driver-class-name");
			this.dbUser = System.getenv("spring.datasource.username");
			this.minimumIdle = System.getenv("spring.datasource.minimumidle");
			this.idleTimeout = Long.parseLong(System.getenv("spring.datasource.idletimeout"));
					
		}catch(Exception e) {
			
		}
	}
}
