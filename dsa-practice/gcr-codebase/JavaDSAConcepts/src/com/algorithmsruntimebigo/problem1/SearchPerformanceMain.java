package com.algorithmsruntimebigo.problem1;

import java.util.Arrays;

public class SearchPerformanceMain {

    public static void main(String[] args) {

        int N = 1_000_000;      // Dataset size
        int target = N - 1;     // Worst-case target

        int[] data = new int[N];

        // Fill dataset
        for (int i = 0; i < N; i++) {
            data[i] = i;
        }

        // -------- Linear Search Timing --------
        long startLinear = System.nanoTime();
        SearchAlgorithms.linearSearch(data, target);
        long endLinear = System.nanoTime();

        double linearTime = (endLinear - startLinear) / 1_000_000.0;

        // -------- Binary Search Timing --------
        Arrays.sort(data); // required before binary search

        long startBinary = System.nanoTime();
        SearchAlgorithms.binarySearch(data, target);
        long endBinary = System.nanoTime();

        double binaryTime = (endBinary - startBinary) / 1_000_000.0;

        // -------- Output --------
        System.out.println("Dataset Size: " + N);
        System.out.println("Linear Search Time: " + linearTime + " ms");
        System.out.println("Binary Search Time: " + binaryTime + " ms");
    }
}
