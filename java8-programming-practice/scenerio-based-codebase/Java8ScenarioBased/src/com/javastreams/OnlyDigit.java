package com.javastreams;

import java.util.stream.Collectors;

public class OnlyDigit {
	public static void main(String[] args) {
		String input = "orderId=AB123XZ9";
		
		String result =
				input.chars()
				.filter(Character::isDigit)
				.mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.joining());
		
		System.out.println(result);
	}
}
