import java.util.*;
public class WordsWithLengths {

    //Method to find length
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

    //Method to split text into words using charAt()
    public static String[] splitUsingCharAt(String text) {

        int len = findLengthWithoutLength(text);

        // 1) Count words
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (ch == ' ') {
                inWord = false;
            }
        }

        //Extract words using start–end indexes
        String[] words = new String[wordCount];
        int idx = 0, start = -1;

        for (int i = 0; i <= len; i++) {
            if (i < len && text.charAt(i) != ' ') {
                if (start == -1) start = i;
            } else {
                if (start != -1) {
                    words[idx++] = text.substring(start, i);
                    start = -1;
                }
            }
        }
        return words;
    }

    // Method to return 2D array
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int len = findLengthWithoutLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //text input
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // Split into words
        String[] words = splitUsingCharAt(text);

        // Build 2D array
        String[][] table = wordsWithLengths(words);

        // Display in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("---------------");
        for (int i = 0; i < table.length; i++) {
            int lengthAsInt = Integer.parseInt(table[i][1]);
            System.out.println(table[i][0] + "\t" + lengthAsInt);
        }
    }
}
