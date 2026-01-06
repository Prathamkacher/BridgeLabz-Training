import java.util.Scanner;

public class ToLowerCase {

    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Call method
        String result = toLowerCase(s);

        // Output
        System.out.println("Lowercase string: " + result);
    }
}
