import java.util.*;
public class TrimUsingCharAt {

    //Find start and end indexes after trimming spaces
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1};
    }

    //Create substring using charAt() only (no substring())
    public static String substringUsingCharAt(String text, int start, int endExclusive) {
        String result = "";
        for (int i = start; i < endExclusive; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }

    //Compare two strings using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = input.nextLine();

        // User-defined trim using charAt()
        int[] idx = findTrimIndexes(text);
        String manualTrim = substringUsingCharAt(text, idx[0], idx[1]);

        // Built-in trim()
        String builtInTrim = text.trim();

        // Compare results
        boolean same = compareUsingCharAt(manualTrim, builtInTrim);

        // Display
        System.out.println("\nTrim using charAt(): [" + manualTrim + "]");
        System.out.println("Trim using trim():    [" + builtInTrim + "]");
        System.out.println("Are both results equal? " + same);
    }
}
