//create a class RemoveDuplicates to remove duplicate character from a string.
import java.util.Scanner;
public class RemoveDuplicates {

    // Method to remove duplicate characters
    public static String removeDuplicates(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character already exists in result
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String output = removeDuplicates(text);

        System.out.println("String after removing duplicates: " + output);
    }
}
