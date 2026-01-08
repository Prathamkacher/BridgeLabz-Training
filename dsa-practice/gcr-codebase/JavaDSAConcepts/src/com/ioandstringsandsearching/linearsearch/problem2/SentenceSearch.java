package com.ioandstringsandsearching.linearsearch.problem2;

public class SentenceSearch {

    public static String findSentenceContainingWord(String[] sentences, String word) {

        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }

        return "Not Found";
    }
}
