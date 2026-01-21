package com.collections.mapinterface.wordfrequency;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

	public static Map<String, Integer> countWords(String text) {
		
		Map<String, Integer> wordCount = new HashMap<>();
		
		text = text.toLowerCase();
		
		text = text.replaceAll("[^a-z ]", "");
		
		String[] words = text.split("\\s+");
		
		for(String word : words) {
			if (word.isEmpty()) {
				continue;
			}
			
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}
		
		return wordCount;
		
	}
}
