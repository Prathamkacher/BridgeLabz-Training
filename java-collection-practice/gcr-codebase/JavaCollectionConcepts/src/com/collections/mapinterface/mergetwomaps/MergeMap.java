package com.collections.mapinterface.mergetwomaps;

import java.util.*;

public class MergeMap {

    public static Map<String, Integer> mergeMaps(
            Map<String, Integer> map1,
            Map<String, Integer> map2) {

        Map<String, Integer> result = new HashMap<>();

        for (String key : map1.keySet()) {
            result.put(key, map1.get(key));
        }

        for (String key : map2.keySet()) {

            if (result.containsKey(key)) {
                result.put(key, result.get(key) + map2.get(key));
            } else {
                result.put(key, map2.get(key));
            }
        }

        return result;
    }
}
