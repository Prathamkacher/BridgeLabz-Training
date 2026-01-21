package com.collections.mapinterface.highestkeyvalue;
import java.util.*;

public class HighestKeyMain {

    public static void main(String[] args) {

        Map<String, Integer> input = new HashMap<>();
        input.put("A", 10);
        input.put("B", 20);
        input.put("C", 15);

        String result = HighestValueKey.findMaxKey(input);

        System.out.println(result);
    }
}
