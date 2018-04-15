package com.nihal.springboot.practiceBoot.cdi;

import javax.inject.Named;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;


@Named
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=ScopedProxyMode.TARGET_CLASS)
public class SomeJDBCConnection {

	public SomeJDBCConnection() {
//		Write Logic Here
	}

	
	
}
