//create a class SubstringOccurrences to count how many times a given substring occurs in a string.
import java.util.Scanner;
public class SubstringOccurrences {

    // Method to count occurrences of substring
    public static int countOccurrences(String text, String sub) {

        int count = 0;
        int index = 0;

        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String text = input.nextLine();

        System.out.print("Enter substring: ");
        String sub = input.nextLine();

        int result = countOccurrences(text, sub);

        System.out.println("Substring occurs " + result + " times.");
    }
}
