package com.collections.listinterface.findfrequency;

import java.util.*;

public class CountFrequencyMain {

	public static void main(String[] args) {
		
		List<String> input = Arrays.asList("kiwi", "orange", "lemon", "kiwi", "lemon", "kiwi");
		
		Map<String, Integer> result = CountFrequency.countFrequency(input);
		
		System.out.println("Input: " + input);
		System.out.println("Output: " + result);
	}
}
