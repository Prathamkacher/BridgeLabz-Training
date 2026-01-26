package com.streams.countfilewords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WordCounter {

    public static HashMap<String, Integer> countWords(String filePath)
            throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        HashMap<String, Integer> map = new HashMap<>();

        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.toLowerCase().split("\\W+");

            for (String word : words) {
                if (!word.isEmpty()) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
        }

        br.close();
        return map;
    }
}
