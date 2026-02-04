package com.conversionlogicalquestions.maptolist;

import java.util.*;
import java.util.stream.*;

public class MapToListMain {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 25);
        map.put("C", 30);
        map.put("D", 15);

        // Keys to List
        List<String> keys = map.keySet().stream().collect(Collectors.toList());
        System.out.println("1. Keys: " + keys);

        // Values to List
        List<Integer> values = map.values().stream().collect(Collectors.toList());
        System.out.println("2. Values: " + values);

        // Entries to List
        List<Map.Entry<String, Integer>> entries = map.entrySet().stream().collect(Collectors.toList());
        System.out.println("3. Entries: " + entries);

        // Key-Value Strings
        List<String> keyValueStrings = map.entrySet().stream()
                .map(e -> e.getKey() + " : " + e.getValue())
                .collect(Collectors.toList());
        System.out.println("4. Key-Value Strings: " + keyValueStrings);

        // Custom Object List
        List<Pair> pairList = map.entrySet().stream()
                .map(e -> new Pair(e.getKey(), e.getValue()))
                .collect(Collectors.toList());
        System.out.println("5. Pair List: " + pairList);

        // Sorted by Key
        List<Map.Entry<String, Integer>> sortedByKey = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toList());
        System.out.println("6. Sorted by Key: " + sortedByKey);

        // Sorted by Value
        List<Map.Entry<String, Integer>> sortedByValue = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());
        System.out.println("7. Sorted by Value: " + sortedByValue);

        // Filter value > N
        int N = 20;
        List<String> filtered = map.entrySet().stream()
                .filter(e -> e.getValue() > N)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("8. Value > " + N + ": " + filtered);

        // Keys where value is even
        List<String> evenKeys = map.entrySet().stream()
                .filter(e -> e.getValue() % 2 == 0)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("9. Even Value Keys: " + evenKeys);

        // DTO List
        List<EntryDTO> dtoList = map.entrySet().stream()
                .map(e -> new EntryDTO(e.getKey(), e.getValue()))
                .collect(Collectors.toList());
        System.out.println("10. DTO List: " + dtoList);
    }
}