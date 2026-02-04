package com.conversionlogicalquestions.arraytocollection;

import java.util.*;
import java.util.stream.*;

public class ArrayToCollectionMain {

    public static void main(String[] args) {

        // Array to List using stream
        String[] arr = {"A", "B", "C"};
        List<String> list1 = Arrays.stream(arr).collect(Collectors.toList());
        System.out.println("1. Array -> List: " + list1);

        // Array to Set
        Set<String> set2 = Arrays.stream(arr).collect(Collectors.toSet());
        System.out.println("2. Array -> Set: " + set2);

        // List to array
        List<String> list = Arrays.asList("X", "Y", "Z");
        String[] array3 = list.toArray(new String[0]);
        System.out.println("3. List -> Array: " + Arrays.toString(array3));

        // Set to array
        Set<String> set = new HashSet<>(Arrays.asList("M", "N", "O"));
        String[] array4 = set.toArray(new String[0]);
        System.out.println("4. Set -> Array: " + Arrays.toString(array4));

        // int[] to List<Integer>
        int[] nums = {1, 2, 3};
        List<Integer> list5 = Arrays.stream(nums).boxed().collect(Collectors.toList());
        System.out.println("5. int[] -> List<Integer>: " + list5);

        // String[] to List<String>
        String[] words = {"Java", "Python"};
        List<String> list6 = Arrays.stream(words).collect(Collectors.toList());
        System.out.println("6. String[] -> List: " + list6);

        // Array to Map with index as key
        Map<Integer, String> map7 = IntStream.range(0, arr.length)
                .boxed()
                .collect(Collectors.toMap(i -> i, i -> arr[i]));
        System.out.println("7. Array -> Map(index,value): " + map7);

        // 2D array to flat List
        int[][] matrix = {{1, 2}, {3, 4}};
        List<Integer> flatList = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("8. 2D Array -> Flat List: " + flatList);

        // Array to Map with value as key
        Map<String, Integer> map9 = Arrays.stream(arr)
                .collect(Collectors.toMap(s -> s, String::length));
        System.out.println("9. Value as Key Map: " + map9);

        // Array to distinct List
        String[] dupArr = {"A", "B", "A", "C"};
        List<String> distinctList = Arrays.stream(dupArr)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("10. Distinct List: " + distinctList);
    }
}