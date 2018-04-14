package com.nihal.springboot.practiceBoot.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class personsDAO {

	@Autowired
	public JDBCConnectionBean jdbcConnection;

	public JDBCConnectionBean getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JDBCConnectionBean jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
}
