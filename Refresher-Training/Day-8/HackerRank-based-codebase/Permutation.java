import java.util.*;
public class Permutation {

    public static void generatePermutation(int[] arr, boolean[] used, List<Integer> current) {

        if (current.size() == arr.length) {
            System.out.println(current);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (used[i])
                continue;

            // choose
            used[i] = true;
            current.add(arr[i]);

            // recursive call
            generatePermutation(arr, used, current);

            // backtrack
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        generatePermutation(arr, new boolean[arr.length], new ArrayList<>());
    }
}