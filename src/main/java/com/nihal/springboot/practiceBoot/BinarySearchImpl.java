package com.nihal.springboot.practiceBoot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	@Autowired
	SortAlgorithm sortAlg;
	
	
	public int binarySearch(int[] nums, int searchNum) {
//		Implementing Sorting lofic
		int sortNums[] = sortAlg.sort(nums);
		int result = Arrays.binarySearch(sortNums,searchNum);  
		System.out.println(sortAlg);
//		Search the Array
		return result;
	}


//	public void setSortAlg(SortAlgorithm sortAlg) {
//		this.sortAlg = sortAlg;
//	}


//	public BinarySearchImpl(SortAlgorithm sortAlg) {
//		super();
//		this.sortAlg = sortAlg;
//	}
	
}
