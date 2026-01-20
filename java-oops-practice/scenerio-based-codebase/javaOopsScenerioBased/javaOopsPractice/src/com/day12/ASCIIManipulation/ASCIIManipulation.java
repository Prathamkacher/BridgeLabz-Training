/*
Problem Statement: ASCII Manipulation – Cleanse and Invert
Write a program that generates a secure key from a given input string by applying a 
series of validation and transformation rules.

Rules for Input Validation:
1. the input is null or its length is less than 6, the program should treat it as invalid.
2.The input must contain only alphabetic characters (A–Z or a–z).
3.If it contains digits, spaces, or special characters, it is invalid.
4.If the input is invalid, print:
Invalid Input

Rules for Key Generation (if input is valid):
1.Convert the entire string to lowercase.
2.From the lowercase string, select only those characters whose ASCII value is odd.
3.Reverse the resulting string.
4.Convert the characters at even indices (0, 2, 4, …) of the reversed string to uppercase.
5.Display the final transformed string as the generated key.
*/

import java.util.*;

public class ASCIIManipulation {
	
	public static String CleanseAndInvert(String input){
		//rule 1: check if input is null or length is less than 6
		if (input == null || input.length() < 6){
			return "";
		}
		
		//rule 2: input can only be alphabet
		if (!input.matches("[a-zA-Z]+")){ // or (!Character.isLetter(ch))
			return "";
		}
		
		//converting into lowercase
		input = input.toLowerCase();
		
		//store only whose index is not even
		StringBuilder filter = new StringBuilder();
		
		for(char ch : input.toCharArray()){
			if(ch%2 != 0){
				filter.append(ch);
			}
		}
		
		//reverse the string
		filter.reverse();
		
		//even index uppercase
		for(int i=0; i<filter.length(); i++){
			if(i%2 == 0){
				filter.setCharAt(i, Character.toUpperCase(filter.charAt(i)));
			}
		}
		return filter.toString();
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Word:");
		String word = input.nextLine();
		
		String result = CleanseAndInvert(word);
		
		if (result == ""){
			System.out.println("Invalid Input");
		}
		else{
			System.out.println("The generated key is - " + result);
		}
		
	}
}