package com.conversionlogicalquestions.otherconversions;

import java.util.*;
import java.util.stream.*;

public class OtherConversionsMain {
	 public static void main(String[] args) {

	        List<String> list = Arrays.asList("apple", "banana", "cherry", "apple");

	        // Stream to List
	        List<String> list1 = list.stream().collect(Collectors.toList());
	        System.out.println("1. Stream -> List: " + list1);

	        // Stream to Set
	        Set<String> set2 = list.stream().collect(Collectors.toSet());
	        System.out.println("2. Stream -> Set: " + set2);

	        // Stream to Map
	        Map<String, Integer> map3 = list.stream()
	                .distinct()
	                .collect(Collectors.toMap(s -> s, String::length));
	        System.out.println("3. Stream -> Map: " + map3);

	        // Optional to List
	        Optional<String> optional = Optional.of("Java8");
	        List<String> list4 = optional.map(Collections::singletonList)
	                .orElse(Collections.emptyList());
	        System.out.println("4. Optional -> List: " + list4);

	        // List to comma-separated String
	        String csv = String.join(", ", list);
	        System.out.println("5. List -> CSV: " + csv);

	        // List to JSON-like String
	        String jsonLike = list.stream()
	                .map(s -> "\"" + s + "\"")
	                .collect(Collectors.joining(", ", "[", "]"));
	        System.out.println("6. List -> JSON-like: " + jsonLike);

	        // Map to comma-separated String
	        Map<String, Integer> map = Map.of("A", 10, "B", 20);
	        String mapStr = map.entrySet().stream()
	                .map(e -> e.getKey() + "=" + e.getValue())
	                .collect(Collectors.joining(", "));
	        System.out.println("7. Map -> CSV String: " + mapStr);

	        // List to grouped Map
	        Map<Integer, List<String>> grouped = list.stream()
	                .collect(Collectors.groupingBy(String::length));
	        System.out.println("8. Grouped Map: " + grouped);

	        // Grouped Map back to List
	        List<String> list9 = grouped.values().stream()
	                .flatMap(List::stream)
	                .collect(Collectors.toList());
	        System.out.println("9. Grouped Map -> List: " + list9);

	        // Partitioned Map<Boolean,List> to two Lists
	        Map<Boolean, List<String>> partitioned = list.stream()
	                .collect(Collectors.partitioningBy(s -> s.length() > 5));

	        List<String> greater = partitioned.get(true);
	        List<String> smaller = partitioned.get(false);

	        System.out.println("10. Length > 5: " + greater);
	        System.out.println("    Length <= 5: " + smaller);
	    }
}
