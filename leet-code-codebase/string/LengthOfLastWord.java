import java.util.Scanner;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpace = s.lastIndexOf(' ');

        return s.length() - lastSpace - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int result = lengthOfLastWord(s);

        // Output
        System.out.println("Length of last word: " + result);
    }
}
