package com.collections.listinterface.removeduplicates;

import java.util.*;


public class RemoveDuplicateMain {

	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(10, 20, 30, 20, 20, 10, 40, 30);
		
		List<Integer> output = RemoveDuplicate.removeDuplicate(input);
		
		System.out.println("Before removing duplicates: " + input);
		System.out.println("After removing duplicates: " + output);
	}
}
