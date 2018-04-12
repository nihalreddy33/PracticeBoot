package com.nihal.springboot.practiceBoot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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
