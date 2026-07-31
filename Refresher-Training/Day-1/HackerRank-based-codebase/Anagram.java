import java.util.Scanner;

public class Anagram {
     static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean result = true;
        if(a.length() != b.length()){
            result = false;
        }
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        int[] freq = new int[26];
        
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) - 'a']++;
        }

        for (int i = 0; i < b.length(); i++) {
            freq[b.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                result = false;
            }
        }

        return result;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
