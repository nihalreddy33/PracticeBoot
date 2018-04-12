package com.nihal.springboot.practiceBoot;

import java.util.Arrays;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {
	
	public int[] sort(int[] nums) {
//		Write Logic Here
		Arrays.sort(nums);
		return nums;
	}

}
