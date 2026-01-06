import java.util.Scanner;

public class ReverseString {

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert string to char array
        char[] chars = input.toCharArray();

        reverseString(chars);

        // Output result
        System.out.print("Reversed string: ");
        for (char c : chars) {
            System.out.print(c);
        }
    }
}
