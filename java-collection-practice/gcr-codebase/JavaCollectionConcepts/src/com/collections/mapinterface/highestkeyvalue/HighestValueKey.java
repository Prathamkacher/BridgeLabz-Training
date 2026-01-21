package com.collections.mapinterface.highestkeyvalue;

import java.util.Map;

public class HighestValueKey {

    public static String findMaxKey(Map<String, Integer> map) {

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (String key : map.keySet()) {

            int value = map.get(key);

            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }

        return maxKey;
    }
}
