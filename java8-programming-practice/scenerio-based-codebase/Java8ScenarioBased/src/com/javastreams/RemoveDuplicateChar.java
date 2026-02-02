package com.javastreams;

import java.util.stream.Collectors;

public class RemoveDuplicateChar {
	public void main(String[] args) {
		String input = "banana";
		
		String result =
				input.chars()
					.distinct()
					.mapToObj(c -> String.valueOf((char) c))
					.collect(Collectors.joining()
				);
		
		System.out.println(result);
	}
}
