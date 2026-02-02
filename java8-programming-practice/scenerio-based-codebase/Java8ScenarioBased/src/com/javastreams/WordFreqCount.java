package com.javastreams;

import java.util.*;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class WordFreqCount {
	public static void main(String[] args) {
		String input = "java is java and java is fast";
		
		Map<String, Long> freCount = 
				Arrays.stream(input.split(" "))
				.collect(Collectors.groupingBy(
						w -> w,
						LinkedHashMap::new,
						Collectors.counting()
					));
		System.out.println(freCount);
	}
}
