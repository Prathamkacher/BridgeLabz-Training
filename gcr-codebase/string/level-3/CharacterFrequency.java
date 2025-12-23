import java.util.Scanner;

public class CharacterFrequency {

	// Method to find character frequencies and return as 2D array
    public static String[][] findFrequency(String text) {

       	// Frequency array for 256 ASCII characters
       	int[] freq = new int[256];

       	// Count frequency of each character
       	for (int i = 0; i < text.length(); i++) {
           	char ch = text.charAt(i);
           	freq[ch]++;
       	}

       	// Count unique characters
       	int uniqueCount = 0;
       	for (int i = 0; i < text.length(); i++) {
           	if (freq[text.charAt(i)] > 0) {
            	uniqueCount++;
           		freq[text.charAt(i)] = -freq[text.charAt(i)]; // mark as counted
           	}
       	}

       	// Create 2D array to store character and frequency
       	String[][] result = new String[uniqueCount][2];
       	int index = 0;

       	// Reset frequency array sign and store values
       	for (int i = 0; i < 256; i++) {
           	if (freq[i] < 0) {
               	result[index][0] = String.valueOf((char) i);
               	result[index][1] = String.valueOf(-freq[i]);
               	index++;
           	}
       	}

       	return result;
    }

    // Method to display frequency table
    public static void displayFrequency(String[][] data) {

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
       	displayFrequency(frequencyData);

       	sc.close();
    }
}
