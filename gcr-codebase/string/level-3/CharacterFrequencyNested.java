import java.util.Scanner;

public class CharacterFrequencyNested {

    // Method to find character frequency using nested loops
    public static String[] findFrequency(String text) {

        char[] chars = text.toCharArray();
        int length = chars.length;

        int[] freq = new int[length];

        // Find frequency using nested loops
        for (int i = 0; i < length; i++) {
            freq[i] = 1;

            if (chars[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Store character and frequency in 1D String array
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] output = findFrequency(input);

        // Display result
        System.out.println("\nCharacter Frequency:");
        System.out.println("---------------------");
        for (String s : output) {
            System.out.println(s);
        }

        sc.close();
    }
}
