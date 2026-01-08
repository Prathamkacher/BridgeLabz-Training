package com.ioandstringsandsearching.challengeproblem.problem2;

import java.util.Arrays;

public class SearchChallenge {

    // Linear Search: First missing positive integer
    public static int firstMissingPositive(int[] arr) {

        int n = arr.length;
        boolean[] visited = new boolean[n + 2];

        for (int num : arr) {
            if (num > 0 && num <= n + 1) {
                visited[num] = true;
            }
        }

        for (int i = 1; i <= n + 1; i++) {
            if (!visited[i]) {
                return i;
            }
        }

        return -1;
    }

    // Binary Search: Find index of target after sorting
    public static int binarySearchTarget(int[] arr, int target) {

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
