//Create a class PalindromeChecker to check if the string is palindrome or not
import java.util.*;

public class PalindromeChecker{

    //Method to take input from user
    public static String takeInput(Scanner input){
        System.out.print("Enter a string: ");
        return input.nextLine();
    }

    //Method to check if string is palindrome
    public static boolean isPalindrome(String text){

        int start=0;
        int end=text.length()-1;

        while(start<end){
            if(text.charAt(start)!=text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    //Method to display result
    public static void displayResult(String text, boolean result){
        if(result){
            System.out.println(text+" is a Palindrome");
        }else{
            System.out.println(text+" is Not a Palindrome");
        }
    }

    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        String text=takeInput(input);
        boolean result=isPalindrome(text);

        displayResult(text, result);

    }
}
