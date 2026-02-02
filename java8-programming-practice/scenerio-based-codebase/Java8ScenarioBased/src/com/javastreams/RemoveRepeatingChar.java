package com.javastreams;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class RemoveRepeatingChar {
	public void main(String[] args) {
		String input = "aabbccddde";
		
		String result = 
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
				.map(e -> String.valueOf(e.getKey()))
				.collect(Collectors.joining());
		
		System.out.println(result);
	}
}
