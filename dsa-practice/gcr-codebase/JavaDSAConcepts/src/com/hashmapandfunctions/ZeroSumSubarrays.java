package com.hashmapandfunctions;

import java.util.*;

public class ZeroSumSubarrays {

    public static void findZeroSumSubarrays(int[] arr) {

        // Map: sum -> list of indexes
        Map<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;

        // sum 0 at index -1 (important trick)
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // agar same sum pehle aaya hai
            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    System.out.println(
                        "Zero sum subarray from index " +
                        (startIndex + 1) + " to " + i
                    );
                }
            }

            // current index add karo map me
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, -4, -2, -2};
        findZeroSumSubarrays(arr);
    }
}
