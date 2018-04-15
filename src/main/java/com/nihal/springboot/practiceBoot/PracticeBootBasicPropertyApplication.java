package com.nihal.springboot.practiceBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.nihal.springboot.practiceBoot.scope.property.ReadExternalFile;


//@SpringBootApplication
@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class PracticeBootBasicPropertyApplication {
	
	private static Logger LOGGER =  LoggerFactory.getLogger(PracticeBootBasicPropertyApplication.class);
	
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ac = new 
				AnnotationConfigApplicationContext(PracticeBootBasicPropertyApplication.class)){
			
			ReadExternalFile rf = ac.getBean(ReadExternalFile.class);
			LOGGER.info("Driver URL --> {}",rf.getDbDriver());
		}
	}
}
