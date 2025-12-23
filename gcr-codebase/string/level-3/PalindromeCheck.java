import java.util.Scanner;

public class PalindromeCheck {

    // Using start and end index comparison
    public static boolean isPalindromeIterative(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Method to reverse a string using
    public static char[] reverseString(String text) {

        int length = text.length();
        char[] reverse = new char[length];

        for (int i = 0; i < length; i++) {
            reverse[i] = text.charAt(length - 1 - i);
        }

        return reverse;
    }

    // Using character arrays
    public static boolean isPalindromeUsingArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        boolean result1 = isPalindromeIterative(input);

        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);

        boolean result3 = isPalindromeUsingArray(input);

        // Display results
        System.out.println("\nPalindrome Check Results:");
        System.out.println("--------------------------------");
        System.out.println("Logic 1 (Iterative)  : " + result1);
        System.out.println("Logic 2 (Recursive)  : " + result2);
        System.out.println("Logic 3 (Char Array) : " + result3);

        sc.close();
    }
}
