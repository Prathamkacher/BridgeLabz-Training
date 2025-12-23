//create a class ReverseString to reverse a given string without using any built-in reverse functions.

import java.util.*;
public class ReverseString{

	public static String reverseString(String text){
		String reversed = "";
		
		for (int i=text.length()-1; i>=0; i--){
			reversed += text.charAt(i);
		}
		
		return reversed;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//user input
		System.out.print("Enter a string: ");
        String text = sc.next();
		
		String result = reverseString(text);
		
		System.out.println("Reversed String: " + result);
	}
}