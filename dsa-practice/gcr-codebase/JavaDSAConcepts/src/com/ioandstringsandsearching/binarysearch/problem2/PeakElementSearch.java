package com.ioandstringsandsearching.binarysearch.problem2;

public class PeakElementSearch {

    // Returns index of any one peak element
    public static int findPeakElement(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left; // peak index
    }
}
