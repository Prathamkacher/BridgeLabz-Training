import java.util.Scanner;
public class MostFrequentCharacter {

    // Method to find most frequent character
    public static char findMostFrequentChar(String text) {

        int[] freq = new int[256]; // ASCII character frequency

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int maxFreq = 0;
        char mostFrequent = text.charAt(0);

        // Find character with maximum frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                mostFrequent = ch;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        char result = findMostFrequentChar(text);

        System.out.println("Most Frequent Character: '" + result + "'");
    }
}
