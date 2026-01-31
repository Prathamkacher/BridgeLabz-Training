package com.collectors.wordfreqencycounter;

import java.util.*;
import java.util.stream.Collectors;

public class TextAnalyzer {

    public Map<String, Integer> countWordFrequency(String paragraph) {

        return Arrays.stream(paragraph.toLowerCase().split("\\W+"))
                .collect(Collectors.toMap(
                        word -> word,
                        word -> 1,
                        Integer::sum
                ));
    }
}
