package com.nihal.springboot.practiceBoot.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;


@Named
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SomeDAO {

	@Inject
	public SomeJDBCConnection jdbcConnection;

	public SomeJDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(SomeJDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
}
