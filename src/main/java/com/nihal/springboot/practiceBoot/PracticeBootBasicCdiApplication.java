package com.nihal.springboot.practiceBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nihal.springboot.practiceBoot.cdi.SomeDAO;



@Configuration
@ComponentScan
public class PracticeBootBasicCdiApplication {
//	What are the beans?
//	What are the dependencies of a bean?
//	Where to Search for Beans?
	
	private static Logger LOGGER =  LoggerFactory.getLogger(PracticeBootBasicCdiApplication.class);
	
	public static void main(String[] args) {
		// Application context maintains all the Beans
		// BinarySearchImpl bs = new BinarySearchImpl(new BubbleSortAlgorithm());
		// int result = bs.binarySearch(new int[] {1,2,3}, 3);

		// SpringApplication.run(PracticeBootApplication.class, args);
		// ApplicationContext ac =
		// SpringApplication.run(PracticeBootBasicCdiApplication.class, args);
		try (AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(
				PracticeBootBasicCdiApplication.class)) {

			// BinarySearchImpl bs = ac.getBean(BinarySearchImpl.class);
			// BinarySearchImpl bs1 = ac.getBean(BinarySearchImpl.class);
			SomeDAO sd = ac.getBean(SomeDAO.class);
			SomeDAO sd1 = ac.getBean(SomeDAO.class);
			LOGGER.info("{}", sd);
			LOGGER.info("{}", sd.getJdbcConnection());
			LOGGER.info("{}", sd1);
			LOGGER.info("{}", sd1.getJdbcConnection());
			// int result = bs.binarySearch(new int[] {3,2,1}, 3);
			// LOGGER.info("Element is found at index: "+result);
		}
	}
}
