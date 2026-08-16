import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'alternate' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternate(String s) {
    // Write your code here
        int max = 0;

        for (char a = 'a'; a <= 'z'; a++) {
            for (char b = (char)(a + 1); b <= 'z'; b++) {

                StringBuilder temp = new StringBuilder();

                for (char c : s.toCharArray()) {
                    if (c == a || c == b)
                        temp.append(c);
                }

                boolean valid = true;

                for (int i = 1; i < temp.length(); i++) {
                    if (temp.charAt(i) == temp.charAt(i - 1)) {
                        valid = false;
                        break;
                    }
                }

                if (valid && temp.length() > 1)
                    max = Math.max(max, temp.length());
            }
        }

        return max;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = Result.alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
