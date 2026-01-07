package com.ioandstringsandsearching.binarysearch.problem2;

public class BinarySearchMain {

    public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1, 0};

        int peakIndex =
            PeakElementSearch.findPeakElement(arr);

        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);
    }
}
