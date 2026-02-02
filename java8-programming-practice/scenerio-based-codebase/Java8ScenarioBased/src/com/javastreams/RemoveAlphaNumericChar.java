package com.javastreams;

import java.util.stream.Collectors;

public class RemoveAlphaNumericChar {
	public void main(String[] args) {
		String input = "ja@va#8!!";
		
		String result = 
				input.chars()
				.filter(Character::isLetterOrDigit)
				.mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.joining());
		
		System.out.println(result);
	}
}
