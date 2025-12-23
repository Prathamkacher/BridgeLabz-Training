//create a class IsPalindrome to check the string is a palindrome.
import java.util.Scanner;
public class IsPalindrome {

	public static String reverseString(String text){
		String reversed = "";
		
		for (int i=text.length()-1; i>=0; i--){
			reversed += text.charAt(i);
		}
		
		return reversed;
	}

	public static boolean ispalindrome(String text){
		String reversed = reverseString(text);
		return text.equals(reversed);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//user input
		System.out.print("Enter a string: ");
        String text = sc.next();
		
		boolean result = ispalindrome(text);
		
		System.out.println("is string palindrome ?" + result);
	}
}