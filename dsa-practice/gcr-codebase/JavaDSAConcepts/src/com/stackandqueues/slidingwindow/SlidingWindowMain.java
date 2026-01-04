package com.stackandqueues.slidingwindow;

public class SlidingWindowMain {

    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = SlidingWindowMaximum.maxSlidingWindow(arr, k);

        System.out.println("Sliding Window Maximum:");
        for (int max : result) {
            System.out.print(max + " ");
        }
    }
}
