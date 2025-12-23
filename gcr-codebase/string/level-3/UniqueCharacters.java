import java.util.Scanner;

public class UniqueCharacters {

    	// Method to find length of string
   	public static int findLength(String text) {
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

    	// Method to find unique characters
    	public static char[] findUniqueCharacters(String text) {

        	int length = findLength(text);

        	// Temporary array
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

            		// Store unique character
            		if (isUnique) {
                		temp[uniqueCount] = current;
                		uniqueCount++;
            		}
        	}


		// final array
        	char[] result = new char[uniqueCount];
        	for (int i = 0; i < uniqueCount; i++) {
            		result[i] = temp[i];
        	}

        	return result;
    	}

    	public static void main(String[] args) {

        	Scanner sc = new Scanner(System.in);

        	// Input
        	System.out.print("Enter a string: ");
        	String input = sc.nextLine();


        	char[] uniqueChars = findUniqueCharacters(input);

        	// Display result
        	System.out.print("\nUnique characters: ");
        	for (char ch : uniqueChars) {
            		System.out.print(ch + " ");
        	}

        	sc.close();
    	}
}
