/*
 * 1. HospitalQueue – Patient Sorting by Criticality (Bubble Sort)
Story: At Apollo Hospital, patients in the ER are initially listed by arrival time. However, before
assigning beds, the staff wants to sort them by criticality level (1–10). Since the list is usually
small (10–20 patients), Bubble Sort is used to quickly sort patients in-place without using extra
memory.
Key Concepts:
● Bubble Sort for small datasets
● In-place comparison
● Swapping adjacent patient records
 */

package com.day4.hospitalqueue;

public class HospitalMain {

    public static void main(String[] args) {

        Patient[] patients = {
            new Patient("Rahul", 4),
            new Patient("Anita", 8),
            new Patient("Mohan", 2),
            new Patient("Priya", 9),
            new Patient("Karan", 5)
        };

        System.out.println("Before Sorting:");
        for (Patient p : patients) {
            System.out.println(p);
        }

        HospitalQueue.bubbleSort(patients);

        System.out.println("\nAfter Sorting (By Criticality):");
        for (Patient p : patients) {
            System.out.println(p);
        }
    }
}
