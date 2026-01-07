package com.ioandstringsandsearching.binarysearch.problem4;

public class BinarySearchMain {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int first =
            FirstLastOccurrenceSearch.findFirstOccurrence(arr, target);
        int last =
            FirstLastOccurrenceSearch.findLastOccurrence(arr, target);

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}
