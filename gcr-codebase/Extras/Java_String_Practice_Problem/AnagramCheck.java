import java.util.Scanner;
public class AnagramCheck {

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String s1, String s2) {

        // Remove spaces and convert to lowercase
        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();

        // If lengths differ, not anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq = new int[256]; // ASCII frequency array

        // Count characters of first string
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
        }

        // Reduce count using second string
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i)]--;
        }

        // Check if all counts are zero
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter second string: ");
        String str2 = input.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("The strings are Anagrams");
        } else {
            System.out.println("The strings are NOT Anagrams");
        }
    }
}
