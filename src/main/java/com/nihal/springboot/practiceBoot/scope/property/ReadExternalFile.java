package com.nihal.springboot.practiceBoot.scope.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadExternalFile {

	@Value("${spring.datasource.driverClassName}")
	private String dbDriver;

	public String getDbDriver() {
		return dbDriver;
	}

	public void setDbDriver(String dbDriver) {
		this.dbDriver = dbDriver;
	}
	

	
	
}
