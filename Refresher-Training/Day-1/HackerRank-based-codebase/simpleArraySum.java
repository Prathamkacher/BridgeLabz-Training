import java.io.*;
import java.util.*;
import java.util.stream.*;

public class simpleArraySum {

    static class Result {

        public static int simpleArraySum(List<Integer> ar) {
            int sum = 0;

            for (int i = 0; i < ar.size(); i++) {
                sum += ar.get(i);
            }

            return sum;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        int arCount = Integer.parseInt(bufferedReader.readLine());

        List<Integer> ar = Stream.of(bufferedReader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = Result.simpleArraySum(ar);

        System.out.println(result);
    }
}