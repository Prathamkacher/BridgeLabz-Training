package com.ioandstringsandsearching.challengeproblem.problem2;

public class SearchChallengeMain {

    public static void main(String[] args) {

        int[] arr = {3, 4, -1, 1};
        int target = 4;

        int missing =
            SearchChallenge.firstMissingPositive(arr);

        int index =
            SearchChallenge.binarySearchTarget(arr, target);

        System.out.println("First missing positive: " + missing);
        System.out.println("Index of target after sorting: " + index);
    }
}
