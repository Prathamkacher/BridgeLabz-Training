import java.util.*;
public class VowelConsonantCounter {

    // Method to check if a character is Vowel, Consonant, or Not a Letter
    public static String checkCharacter(char ch) {

        // Convert uppercase to lowercase using ASCII logic
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {
		
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to count vowels and consonants using charAt()
    public static int[] countVowelsAndConsonants(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            String result = checkCharacter(text.charAt(i));

            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // user input
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // Call method
        int[] result = countVowelsAndConsonants(text);

        // Display result
        System.out.println("\nVowel Count: " + result[0]);
        System.out.println("Consonant Count: " + result[1]);
    }
}
