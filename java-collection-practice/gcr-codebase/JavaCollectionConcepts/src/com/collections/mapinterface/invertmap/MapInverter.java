package com.collections.mapinterface.invertmap;

import java.util.*;

public class MapInverter {

    public static Map<Integer, List<String>> invert(Map<String, Integer> map) {

        Map<Integer, List<String>> result = new HashMap<>();

        for (String key : map.keySet()) {

            Integer value = map.get(key);

            if (!result.containsKey(value)) {
                result.put(value, new ArrayList<>());
            }

            result.get(value).add(key);
        }

        return result;
    }
}
