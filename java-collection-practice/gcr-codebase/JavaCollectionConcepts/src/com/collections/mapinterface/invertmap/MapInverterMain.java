package com.collections.mapinterface.invertmap;

import java.util.*;

public class MapInverterMain {

    public static void main(String[] args) {

        Map<String, Integer> input = new HashMap<>();
        input.put("A", 10);
        input.put("B", 20);
        input.put("C", 10);

        Map<Integer, List<String>> output =
                MapInverter.invert(input);

        System.out.println(output);
    }
}
