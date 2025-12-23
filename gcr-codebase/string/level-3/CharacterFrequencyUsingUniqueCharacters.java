import java.util.Scanner;

public class CharacterFrequencyUsingUniqueCharacters {

    // Method to find unique characters
    public static char[] findUniqueCharacters(String text) {

        int length = text.length();
        char[] temp = new char[length];
        int uniqueCount = 0;

        // Outer loop for each character
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check previous characters
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount++] = current;
            }
        }

        // Create final array of exact size
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to find frequency using unique characters
    public static String[][] findFrequency(String text) {

        // Frequency array for 256 ASCII characters
        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Get unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Create 2D array to store character and frequency
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    // Method to display frequency table
    public static void displayResult(String[][] data) {

        System.out.println("\nCharacter\tFrequency");
        System.out.println("-------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] frequencyData = findFrequency(input);

        // Display result
        displayResult(frequencyData);

        sc.close();
    }
}
