package com.ioandstringsandsearching.binarysearch.problem1;

public class BinarySearchMain {

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        int rotationIndex =
            RotationPointSearch.findRotationPoint(arr);

        System.out.println("Rotation point index: " + rotationIndex);
        System.out.println("Smallest element: " + arr[rotationIndex]);
    }
}
