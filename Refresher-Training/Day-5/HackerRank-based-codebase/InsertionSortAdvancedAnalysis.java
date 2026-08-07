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
     * Complete the 'insertionSort' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static long insertionSort(List<Integer> arr) {
    // Write your code here
        int n = arr.size();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = arr.get(i);
        }
        
        return mergeSort(a, 0, n - 1);
    }
    public static long mergeSort(int[] a, int left, int right) {
        if (left >= right)
            return 0;
        int mid = (left + right) / 2;
        long count = 0;

        count += mergeSort(a, left, mid);
        count += mergeSort(a, mid + 1, right);
        count += merge(a, left, mid, right);

        return count;
    }

    public static long merge(int[] a, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        long count = 0;
        while (i <= mid && j <= right) {

            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                count += (mid - i + 1);
                temp[k++] = a[j++];
            }
        }

        while (i <= mid)
            temp[k++] = a[i++];

        while (j <= right)
            temp[k++] = a[j++];

        for (i = left, k = 0; i <= right; i++, k++) {
            a[i] = temp[k];
        }

        return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                long result = Result.insertionSort(arr);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
