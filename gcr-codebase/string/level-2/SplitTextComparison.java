import java.util.*;
public class SplitTextComparison {

    //Method to find length of string without using length()
    public static int findLengthWithoutLength(String text) {
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

    // Method to split text into words using charAt() (no split())
    public static String[] splitUsingCharAt(String text) {

        int length = findLengthWithoutLength(text);

        //Count number of words
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (ch == ' ') {
                inWord = false;
            }
        }

        //Store words using start–end indexes
        String[] words = new String[wordCount];
        int index = 0;
        int start = -1;

        for (int i = 0; i <= length; i++) {
            if (i < length && text.charAt(i) != ' ') {
                if (start == -1) {
                    start = i;
                }
            } else {
                if (start != -1) {
                    words[index++] = text.substring(start, i);
                    start = -1;
                }
            }
        }

        return words;
    }

    // Method to compare two String arrays using charAt()
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!compareStringsUsingCharAt(arr1[i], arr2[i])) {
                return false;
            }
        }
        return true;
    }

    //helper method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String s1, String s2) {

        if (findLengthWithoutLength(s1) != findLengthWithoutLength(s2)) {
            return false;
        }

        for (int i = 0; i < findLengthWithoutLength(s1); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();

        String[] manualSplit = splitUsingCharAt(text);
        String[] builtInSplit = text.split(" ");

        // Compare results
        boolean isSame = compareStringArrays(manualSplit, builtInSplit);

        // Display words
        System.out.println("\nWords using user-defined method:");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords using split():");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        // Display comparison result
        System.out.println("\nAre both word arrays equal? " + isSame);
    }
}
