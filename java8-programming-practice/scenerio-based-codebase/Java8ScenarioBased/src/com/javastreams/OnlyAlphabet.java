package com.javastreams;

import java.util.stream.Collectors;

public class OnlyAlphabet {
	public void main(String[] args) {
		String input = "java8stream2025";
		
		String result = 
				input.chars()
				.filter(Character::isLetterOrDigit)
				.mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.joining());
		
		System.out.println(result);
	}

}
