//create a class ToggleCase to toggle the case of each character in a given string.

import java.util.Scanner;
public class ToggleCase {

    // Method to toggle case of characters
    public static String toggleCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            }
            // Lowercase to uppercase
            else if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            }
            // Other characters remain same
            else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String toggled = toggleCase(text);

        System.out.println("Toggled string: " + toggled);
    }
}
