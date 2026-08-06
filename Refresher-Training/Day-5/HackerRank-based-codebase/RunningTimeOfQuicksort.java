import java.io.*;
import java.util.*;

public class Solution {
    
    public static int swaps = 0;

    public static int insertionSort(List<Integer> arr) {

        int shifts = 0;

        for (int i = 1; i < arr.size(); i++) {

            int key = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j) > key) {

                arr.set(j + 1, arr.get(j));
                shifts++;
                j--;
            }

            arr.set(j + 1, key);
        }

        return shifts;
    }

    public static int partition(List<Integer> arr, int low, int high) {

        int pivot = arr.get(high);

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr.get(j) <= pivot) {

                i++;

                Collections.swap(arr, i, j);

                swaps++;
            }
        }

        Collections.swap(arr, i + 1, high);
        swaps++;

        return i + 1;
    }

    public static void quickSort(List<Integer> arr, int low, int high) {

        if (low < high) {

            int p = partition(arr, low, high);

            quickSort(arr, low, p - 1);

            quickSort(arr, p + 1, high);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();

            arr1.add(x);
            arr2.add(x);
        }

        int shifts = insertionSort(arr1);
        quickSort(arr2, 0, n - 1);
        System.out.println(shifts - swaps);
        sc.close();
    }
}