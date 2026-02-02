package com.javastreams;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AllNonRepeatingChar {
	public static void main(String[] args) {
		String input = "programming";
		
		List<Character> allChar = 
				input.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(
						c -> c,
						LinkedHashMap::new,
						Collectors.counting()
				))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() == 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println(allChar);
	}
}
