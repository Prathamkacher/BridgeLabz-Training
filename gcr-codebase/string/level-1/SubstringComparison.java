//create SubstringComparison class to create a substring from a String using charAt() and built-in methods.
import java.util.*;
public class SubstringComparison {

    //method to create substring using charAt()
    public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    //method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //user input
        System.out.print("Enter the string: ");
        String text = input.next();
        System.out.print("Enter start index: ");
        int start = input.nextInt();
        System.out.print("Enter end index: ");
        int end = input.nextInt();

        //Substring using charAt()
        String subCharAt = substringUsingCharAt(text, start, end);

        //Substring using built-in method
        String subBuiltIn = text.substring(start, end);

        //Compare both substrings.
        boolean isSame = compareUsingCharAt(subCharAt, subBuiltIn);

        // print results.
        System.out.println("Substring using charAt(): " + subCharAt);
        System.out.println("Substring using substring(): " + subBuiltIn);
        System.out.println("Are both substrings equal? " + isSame);
    }
}