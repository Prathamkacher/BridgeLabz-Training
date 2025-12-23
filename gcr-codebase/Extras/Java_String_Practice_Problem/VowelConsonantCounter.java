//create VowelConsonantCounter class to count the number of vowel and consonents in a string.

import java.util.Scanner;
public class VowelConsonantCounter {

    //method to count vowels and consonants
    public static int[] countVowelsAndConsonants(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Convert uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            // Check if character is a letter
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || 
                    ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		//user input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        int[] result = countVowelsAndConsonants(text);

        System.out.println("Vowels count     : " + result[0]);
        System.out.println("Consonants count : " + result[1]);
    }
}