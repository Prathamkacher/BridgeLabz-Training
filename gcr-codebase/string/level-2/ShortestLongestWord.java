import java.util.*;
public class ShortestLongestWord {

    //Find length WITHOUT using length()
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

    //Split text into words using charAt()
    public static String[] splitUsingCharAt(String text) {

        int len = findLengthWithoutLength(text);

        // Count words
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

        // Extract words
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

    //Build 2D array
    public static String[][] wordsWithLengths(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int len = findLengthWithoutLength(words[i]);
            table[i][0] = words[i];
            table[i][1] = String.valueOf(len);
        }
        return table;
    }

    //Find shortest & longest words
    public static int[] findShortestAndLongest(String[][] table) {
        int shortestIdx = 0;
        int longestIdx = 0;

        int shortestLen = Integer.parseInt(table[0][1]);
        int longestLen  = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {
            int currLen = Integer.parseInt(table[i][1]);
            if (currLen < shortestLen) {
                shortestLen = currLen;
                shortestIdx = i;
            }
            if (currLen > longestLen) {
                longestLen = currLen;
                longestIdx = i;
            }
        }
        return new int[]{shortestIdx, longestIdx};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();

        String[] words = splitUsingCharAt(text);
        String[][] table = wordsWithLengths(words);
        int[] result = findShortestAndLongest(table);

        // Display table
        System.out.println("\nWord\tLength");
        System.out.println("---------------");
        for (int i = 0; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            System.out.println(table[i][0] + "\t" + len);
        }

        // Display shortest & longest
        System.out.println("\nShortest word: " + table[result[0]][0] +
                " (Length: " + table[result[0]][1] + ")");
        System.out.println("Longest word: " + table[result[1]][0] +
                " (Length: " + table[result[1]][1] + ")");
    }
}
