package com.nihal.springboot.practiceBoot.basic;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements SortAlgorithm{
	
	public int[] sort(int[] nums) {
//		Write Logic Here
		Arrays.sort(nums);
		return nums;
	}

}
