import java.util.Scanner;
public class RemoveSpecificCharacter {

    // Method to remove a specific character
    public static String removeCharacter(String text, char removeChar) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch != removeChar) {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String text = input.nextLine();

        System.out.print("Enter character to remove: ");
        char removeChar = input.next().charAt(0);

        String modified = removeCharacter(text, removeChar);

        System.out.println("Modified String: " + modified);
    }
}
