package com.hashmapandfunctions;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    // Method to find the length of longest consecutive sequence
    public static int longestConsecutive(int[] arr) {

        // HashSet to store all elements
        HashSet<Integer> set = new HashSet<>();

        // Add all elements to the set
        for (int num : arr) {
            set.add(num);
        }

        int longestLength = 0;

        // Traverse through the array
        for (int num : arr) {

            // Check if num is the start of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentLength = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                // Update longest sequence length
                longestLength = Math.max(longestLength, currentLength);
            }
        }

        return longestLength;
    }

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        int result = longestConsecutive(arr);

        System.out.println("Longest consecutive sequence length: " + result);
    }
}