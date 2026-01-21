package com.collections.mapinterface.mergetwomaps;

import java.util.*;

public class MergeMapsMain {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 10);
        map1.put("B", 20);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 30);
        map2.put("C", 40);

        Map<String, Integer> result =
                MergeMap.mergeMaps(map1, map2);

        System.out.println(result);
    }
}
