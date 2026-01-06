import java.util.Scanner;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {

        int i = 0; // pointer for s
        int j = 0; // pointer for t

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;   // move in s only when matched
            }
            j++;       // always move in t
        }

        return i == s.length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter string t: ");
        String t = sc.nextLine();

        boolean result = isSubsequence(s, t);

        if (result) {
            System.out.println("Yes, s is a subsequence of t");
        } else {
            System.out.println("No, s is NOT a subsequence of t");
        }

        sc.close();
    }
}
