package com.ioandstringsandsearching.filereader.problem2;

public class CountMain {

    public static void main(String[] args) {

        String filePath = "src/com/ioandstringsandsearching/filereader/problem2/sample.txt";
        String wordToFind = "Java";

        int occurrences = WordCount.countWordOccurrence(filePath, wordToFind);

        System.out.println(
            "Word '" + wordToFind + "' occurs " + occurrences + " times."
        );
    }
}
