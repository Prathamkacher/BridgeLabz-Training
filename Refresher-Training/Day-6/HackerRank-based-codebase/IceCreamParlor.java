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
     * Complete the 'icecreamParlor' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[][] arr2 = new int[n][2];

        // Store price and original index
        for (int i = 0; i < n; i++) {
            arr2[i][0] = arr.get(i);
            arr2[i][1] = i + 1;
        }

        // Sort according to price
        Arrays.sort(arr2, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < n; i++) {

            int target = m - arr2[i][0];
            int left = i + 1;
            int right = n - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr2[mid][0] == target) {
                    int first = arr2[i][1];
                    int second = arr2[mid][1];

                    if (first < second)
                        return Arrays.asList(first, second);
                    else
                        return Arrays.asList(second, first);
                }
                if (arr2[mid][0] < target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return new ArrayList<>();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int m = Integer.parseInt(bufferedReader.readLine().trim());

                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                List<Integer> result = Result.icecreamParlor(m, arr);

                bufferedWriter.write(
                        result.stream()
                                .map(Object::toString)
                                .collect(joining(" "))
                                + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
