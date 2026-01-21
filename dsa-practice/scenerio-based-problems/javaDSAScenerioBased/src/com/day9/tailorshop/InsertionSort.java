package com.day9.tailorshop;

public class InsertionSort {

    public static void sortByDeadline(Order[] orders, int n) {

        for (int i = 1; i < n; i++) {

            Order key = orders[i];
            int j = i - 1;

            // Shift orders with later deadlines to right
            while (j >= 0 && orders[j].deadline > key.deadline) {
                orders[j + 1] = orders[j];
                j--;
            }

            orders[j + 1] = key;
        }
    }
}

