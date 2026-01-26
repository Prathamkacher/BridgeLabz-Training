package com.streams.countfilewords;

import java.io.IOException;
import java.util.HashMap;

public class CountWordsMain {

    public static void main(String[] args) {

        String filePath = "src/com/streams/countfilewords/input.txt";

        try {
            HashMap<String, Integer> wordMap =
                    WordCounter.countWords(filePath);

            TopFiveWords.printTop5(wordMap);

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
