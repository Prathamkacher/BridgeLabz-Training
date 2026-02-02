package com.javastreams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountChar {
	public static void main(String[] args) {
		String input = "java stream";
		
		Map<Character, Long> result =
				input.chars()
					.filter(c -> c != ' ')
					.mapToObj(c -> (char) c)
					.collect(Collectors.groupingBy(
							c -> c,
							LinkedHashMap::new,
							Collectors.counting()
					));
		System.out.println(result);
	}
}
