package com.nihal.springboot.practiceBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class PracticeBootApplication {
//	What are the beans?
//	What are the dependencies of a bean?
//	Where to Search for Beans?
	public static void main(String[] args) {
//		Application context maintains all the Beans
//		BinarySearchImpl bs = new BinarySearchImpl(new BubbleSortAlgorithm());
//		int result = bs.binarySearch(new int[] {1,2,3}, 3);
		
//		SpringApplication.run(PracticeBootApplication.class, args);
		ApplicationContext ac = SpringApplication.run(PracticeBootApplication.class, args);
		 BinarySearchImpl bs = ac.getBean(BinarySearchImpl.class);
		 BinarySearchImpl bs1 = ac.getBean(BinarySearchImpl.class);
		 System.out.println(bs);
		 System.out.println(bs1);
		 int result = bs.binarySearch(new int[] {3,2,1}, 3);
		 System.out.println("Element is found at index: "+result);
	}
}
