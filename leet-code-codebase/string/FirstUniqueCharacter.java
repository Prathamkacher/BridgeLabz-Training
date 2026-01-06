import java.util.Scanner;

public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int result = firstUniqChar(s);

        if (result == -1) {
            System.out.println("No unique character found");
        } else {
            System.out.println("First unique character index: " + result);
            System.out.println("Character: " + s.charAt(result));
        }

        sc.close();
    }
}
