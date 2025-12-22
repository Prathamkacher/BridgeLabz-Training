import java.util.*;
public class LowerCaseComparison {

    // Method to convert string to lowercase using charAt() and ASCII logic
    public static String toLowerCaseUsingCharAt(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            result += ch;
        }

        return result;
    }

    //Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //text input
        System.out.print("Enter text: ");
        String text = input.nextLine();

        //Convert using user-defined method
        String manualLower = toLowerCaseUsingCharAt(text);

        //Convert using built-in method
        String builtInLower = text.toLowerCase();

        //Compare both results
        boolean isSame = compareUsingCharAt(manualLower, builtInLower);

        //Display results
        System.out.println("\nLowercase using charAt(): " + manualLower);
        System.out.println("Lowercase using toLowerCase(): " + builtInLower);
        System.out.println("Are both results equal? " + isSame);
    }
}
