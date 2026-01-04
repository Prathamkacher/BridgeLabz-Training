package com.hashmapandfunctions;

import java.util.HashMap;

public class TwoSum {

    // Method to find indices of two numbers that add up to target
    public static int[] twoSum(int[] arr, int target) {

        // HashMap to store value and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {

            int current = arr[i];
            int required = target - current;

            // Check if required value exists in the map
            if (map.containsKey(required)) {
                return new int[]{ map.get(required), i };
            }

            // Store current value with its index
            map.put(current, i);
        }

        // If no solution exists
        return new int[]{ -1, -1 };
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(arr, target);

        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No valid pair found");
        }
    }
}