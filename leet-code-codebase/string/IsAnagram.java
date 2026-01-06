import java.util.Scanner;

public class IsAnagram {

    public static boolean isAnagram(String s, String t) {

        // Check length
        if (s.length() != t.length()) {
            return false;
        }

        // Frequency arrays for ASCII characters
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // Count character frequencies
        for (int i = 0; i < s.length(); i++) {
            freq1[s.charAt(i)]++;
            freq2[t.charAt(i)]++;
        }

        // Compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean result = isAnagram(s, t);

        // Output result
        System.out.println("Are anagrams: " + result);
    }
}
