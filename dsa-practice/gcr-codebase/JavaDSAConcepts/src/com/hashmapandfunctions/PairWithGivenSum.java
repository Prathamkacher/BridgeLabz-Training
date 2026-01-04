package com.hashmapandfunctions;

import java.util.HashSet;

public class PairWithGivenSum {

    // Method to check if a pair with given sum exists
    static boolean hasPairWithSum(int[] arr, int target) {

        // HashSet to store visited elements
        HashSet<Integer> set = new HashSet<>();

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {

            int current = arr[i];
            int required = target - current;

            // Check if required value already exists
            if (set.contains(required)) {
                System.out.println("Pair found: " + current + ", " + required);
                return true;
            }

            // Add current element to the set
            set.add(current);
        }

        // No pair found
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        boolean result = hasPairWithSum(arr, target);

        if (!result) {
            System.out.println("No pair found");
        }
    }
}