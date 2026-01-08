package com.ioandstringsandsearching.linearsearch.problem2;

public class LinearSearchMain {

    public static void main(String[] args) {

        String[] sentences = {
            "Java is powerful",
            "I love data structures",
            "Linear search is simple",
            "Searching is important"
        };

        String word = "search";

        String result =
            SentenceSearch.findSentenceContainingWord(sentences, word);

        System.out.println(result);
    }
}
