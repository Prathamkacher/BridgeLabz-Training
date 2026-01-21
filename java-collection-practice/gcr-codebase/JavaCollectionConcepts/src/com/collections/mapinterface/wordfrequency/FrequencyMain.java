package com.collections.mapinterface.wordfrequency;

import java.util.Map;

public class FrequencyMain {

	public static void main(String[] args) {
		
		String input = "Hello world, Hello aryaman";
		
		Map<String, Integer> result = WordCounter.countWords(input);
		
		System.out.println(result);
	}
}
