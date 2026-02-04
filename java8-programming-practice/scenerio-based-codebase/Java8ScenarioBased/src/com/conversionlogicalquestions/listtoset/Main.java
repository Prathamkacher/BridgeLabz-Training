package com.conversionlogicalquestions.listtoset;

import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C", "A", "B");
        Set<String> set = new HashSet<>(Arrays.asList("X", "Y", "Z"));

        // List to Set (remove duplicates)
        Set<String> set1 = list.stream().collect(Collectors.toSet());
        System.out.println("1. List -> Set: " + set1);

        // List to LinkedHashSet (preserve order)
        Set<String> set2 = list.stream()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("2. List -> LinkedHashSet: " + set2);

        // List to TreeSet (sorted)
        Set<String> set3 = list.stream()
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("3. List -> TreeSet: " + set3);

        // Set to List
        List<String> list4 = set.stream().collect(Collectors.toList());
        System.out.println("4. Set -> List: " + list4);

        // Set to Sorted List
        List<String> list5 = set.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("5. Set -> Sorted List: " + list5);

        // Set of objects to List of names
        Set<Person> people = new HashSet<>(Arrays.asList(
                new Person("Aryan"),
                new Person("Rahul"),
                new Person("Neha")
        ));
        List<String> names = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("6. Object Set -> Name List: " + names);

        // List to Set after filtering condition
        Set<String> set7 = list.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toSet());
        System.out.println("7. Filtered List -> Set: " + set7);

        // List to Set of squares
        List<Integer> nums = Arrays.asList(2, 3, 4);
        Set<Integer> squares = nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toSet());
        System.out.println("8. Squares Set: " + squares);

        // Set to List and reverse order
        List<String> reversed = set.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("9. Reversed List: " + reversed);

        // Merge two Lists and convert to Set
        List<String> listA = Arrays.asList("A", "B");
        List<String> listB = Arrays.asList("B", "C", "D");
        Set<String> mergedSet = Stream.concat(listA.stream(), listB.stream())
                .collect(Collectors.toSet());
        System.out.println("10. Merged List -> Set: " + mergedSet);
    }
}