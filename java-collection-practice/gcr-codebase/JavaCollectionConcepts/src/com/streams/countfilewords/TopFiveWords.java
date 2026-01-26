package com.streams.countfilewords;

import java.util.*;

public class TopFiveWords {

    public static void printTop5(HashMap<String, Integer> map) {

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        for (int i = 0; i < 5 && i < list.size(); i++) {
            System.out.println(
                list.get(i).getKey() + " : " + list.get(i).getValue()
            );
        }
    }
}
