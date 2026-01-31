package com.collectors.wordfreqencycounter;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String paragraph = "Java is powerful and Java is popular. "
                + "Java streams is very useful concept in Java.";

        TextAnalyzer analyzer = new TextAnalyzer();

        Map<String, Integer> frequencyMap =
                analyzer.countWordFrequency(paragraph);

        System.out.println("Word Frequency Counter\n");

        frequencyMap.forEach((word, count) ->
                System.out.println(word + " → " + count));
    }
}
