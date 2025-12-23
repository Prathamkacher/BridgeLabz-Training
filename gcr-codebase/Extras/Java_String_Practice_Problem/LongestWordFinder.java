//create a class LongestWordFinder to find the longest word in a string.
import java.util.Scanner;
public class LongestWordFinder {

    // Method to find the longest word
    public static String findLongestWord(String sentence) {

        String[] words = sentence.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String longest = findLongestWord(sentence);

        System.out.println("Longest word: " + longest);
    }
}