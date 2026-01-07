package com.ioandstringsandsearching.binarysearch.problem3;

public class BinarySearchMain {

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 16;

        boolean found =
            MatrixBinarySearch.searchMatrix(matrix, target);

        System.out.println(found);
    }
}
