package com.javastreams;

import java.util.*;
import java.util.stream.Collectors;

public class CharacterFrquencyCount {
	public static void main(String[] args) {

		String input = "banana";

		Map<Character, Long> freq = 
				input.chars()
					.mapToObj(c -> (char) c)
					.collect(Collectors.groupingBy(
						c -> c, 
						LinkedHashMap::new, 
						Collectors.counting()
					));

		System.out.println(freq);
	}
}
