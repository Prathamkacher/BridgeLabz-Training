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
     * Complete the 'happyLadybugs' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING b as parameter.
     */

    public static String happyLadybugs(String b) {
    // Write your code here
        int[] count = new int[26];
        boolean empty = b.indexOf('_') != -1;

        // Count each color
        for (char c : b.toCharArray()) {
            if (c != '_')
                count[c - 'A']++;
        }

        if (empty) {
            for (int x : count) {
                if (x == 1)
                    return "NO";
            }
            return "YES";
        }

        for (int i = 0; i < b.length(); i++) {
            if ((i == 0 || b.charAt(i - 1) != b.charAt(i)) &&
                (i == b.length() - 1 || b.charAt(i + 1) != b.charAt(i))) {
                return "NO";
            }
        }

        return "YES";

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, g).forEach(gItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                String b = bufferedReader.readLine();

                String result = Result.happyLadybugs(b);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
