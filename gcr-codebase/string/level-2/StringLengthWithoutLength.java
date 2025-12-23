import java.util.*;
public class StringLengthWithoutLength {

    //Method to find length of string without using length()
    public static int findLengthUsingCharAt(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //user input
        System.out.print("Enter a string: ");
        String text = input.next();

        // User-defined method
        int manualLength = findLengthUsingCharAt(text);

        // Built-in method
        int builtInLength = text.length();

        // Display results
        System.out.println("\nLength using user-defined method: " + manualLength);
        System.out.println("Length using built-in length(): " + builtInLength);
    }
}