//create CharComparison class to return all the characters in a string
import java.util.*;
public class CharComparison {

    //method to return characters of a string WITHOUT using toCharArray()
    public static char[] getChar(String text) {

        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    //method to compare two char arrays
    public static boolean compareChar(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //user input
        System.out.print("Enter a string: ");
        String text = input.next();

        //user-defined method
        char[] userArray = getChar(text);

        //Built-in method
        char[] builtInArray = text.toCharArray();

        //Compare both arrays
        boolean isSame = compareChar(userArray, builtInArray);

        //Display characters
        System.out.print("\nCharacters using user-defined method: ");
        for (char c : userArray) {
            System.out.print(c + " ");
        }

        System.out.print("\nCharacters using toCharArray(): ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        //Display comparison result
        System.out.println("\nAre both character arrays equal? " + isSame);
    }
}
