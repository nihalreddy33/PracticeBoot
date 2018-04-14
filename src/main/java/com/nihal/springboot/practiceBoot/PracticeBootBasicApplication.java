package com.nihal.springboot.practiceBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nihal.springboot.practiceBoot.basic.BinarySearchImpl;
import com.nihal.springboot.practiceBoot.scope.personsDAO;


@SpringBootApplication
public class PracticeBootBasicApplication {
//	What are the beans?
//	What are the dependencies of a bean?
//	Where to Search for Beans?
	
	private static Logger LOGGER =  LoggerFactory.getLogger(PracticeBootBasicApplication.class);
	
	public static void main(String[] args) {
//		Application context maintains all the Beans
//		BinarySearchImpl bs = new BinarySearchImpl(new BubbleSortAlgorithm());
//		int result = bs.binarySearch(new int[] {1,2,3}, 3);
		
//		SpringApplication.run(PracticeBootApplication.class, args);
		ApplicationContext ac = SpringApplication.run(PracticeBootBasicApplication.class, args);
//		 BinarySearchImpl bs = ac.getBean(BinarySearchImpl.class);
//		 BinarySearchImpl bs1 = ac.getBean(BinarySearchImpl.class);
		personsDAO pd = ac.getBean(personsDAO.class);
		personsDAO pd1 = ac.getBean(personsDAO.class);
		 LOGGER.info("{}",pd);
		 LOGGER.info("{}",pd.getJdbcConnection());
		 LOGGER.info("{}",pd1);
		 LOGGER.info("{}",pd1.getJdbcConnection());
//		 int result = bs.binarySearch(new int[] {3,2,1}, 3);
//		 LOGGER.info("Element is found at index: "+result);
	}
}
