package com.collections.insurancepolicymanagement;

import java.time.LocalDate;
import java.util.*;

public class InsuranceSystemMain {

    public static void main(String[] args) {

        Set<Policy> hashSet = new HashSet<>();        
        Set<Policy> linkedSet = new LinkedHashSet<>(); 
        Set<Policy> treeSet = new TreeSet<>();        

        // Adding policies
        Policy p1 = new Policy("P1", "Amit",
                LocalDate.now().plusDays(10), "Health", 5000);
        Policy p2 = new Policy("P2", "Riya",
                LocalDate.now().plusDays(40), "Auto", 3000);
        Policy p3 = new Policy("P3", "Neha",
                LocalDate.now().plusDays(20), "Health", 6000);
        Policy p4 = new Policy("P1", "Duplicate",
                LocalDate.now().plusDays(15), "Home", 8000); 

        Collections.addAll(hashSet, p1, p2, p3, p4);
        Collections.addAll(linkedSet, p1, p2, p3, p4);
        Collections.addAll(treeSet, p1, p2, p3, p4);


        System.out.println("All Policies:");
        hashSet.forEach(System.out::println);


        System.out.println("\nExpiring Soon:");
        for (Policy p : treeSet) {
            if (p.expiryDate.isBefore(LocalDate.now().plusDays(30))) {
                System.out.println(p);
            }
        }


        System.out.println("\nHealth Policies:");
        for (Policy p : hashSet) {
            if (p.coverageType.equals("Health")) {
                System.out.println(p);
            }
        }


        testSet(new HashSet<>(), "HashSet");
        testSet(new LinkedHashSet<>(), "LinkedHashSet");
        testSet(new TreeSet<>(), "TreeSet");
    }

    static void testSet(Set<Policy> set, String name) {

        long start = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            set.add(new Policy("P" + i, "User",
                    LocalDate.now(), "Health", 1000));
        }

        long end = System.nanoTime();
        System.out.println(name + " Add Time: " + (end - start));
    }
}
