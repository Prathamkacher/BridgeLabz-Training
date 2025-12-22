//create StringComparison class to compare two strings and check if they are equal.
import java.util.*;
public class StringComparison {
	
	public static boolean compareUsingCharAt(String a, String b){
		//if length are different then they are not equal.
		if(a.length() != b.length()){
			return false;
		}
		
		//comapre each char
		for (int i = 0; i<a.length(); i++){
			if (a.charAt(i) != b.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main (String[] args){
	
		//user input.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String a = input.next();
		System.out.print("Enter first string: ");
		String b = input.next();
		
		//compare using charAt.
		boolean charAt = compareUsingCharAt(a, b);
		
		//compare using equal().
		boolean equals = a.equals(b);
		
		//Display results.
		System.out.println("Result using charAt: " + charAt);
		System.out.println("Result using equals(): " + equals);
		
		//check if both strings are equal.
		if (charAt == equals){
			System.out.println("Both methods give the same result");
		} else{
			System.out.println("Both methods give the different result");
		}
	}
}