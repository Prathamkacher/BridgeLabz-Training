package com.ioandstringsandsearching.linearsearch.problem1;

public class LinearSearchMain {

    public static void main(String[] args) {

        int[] arr = {5, 8, 3, -2, 7, -9};

        int index = FirstNegativeSearch.findFirstNegative(arr);

        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
        } else {
            System.out.println("No negative number found");
        }
    }
}
