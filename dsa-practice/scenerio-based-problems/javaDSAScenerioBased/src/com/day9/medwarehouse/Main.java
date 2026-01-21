/*
 * 10. MedWarehouse – Sorting Medicines by Expiry (Merge Sort)
Story: A pharmaceutical warehouse handles medicine records from multiple branches, each
sending a sorted list by expiry date. To ensure none are wasted, the system uses Merge Sort
to compile all expiry dates and alert if any medicine is nearing expiration.
Concepts Involved:
● Merge Sort
● Sorted sublist merging
● Critical for time-sensitive inventory
 */

package com.day9.medwarehouse;

public class Main {

    public static void main(String[] args) {

        Medicine[] medicines = {
            new Medicine("Paracetamol", 5),
            new Medicine("Cough Syrup", 10),
            new Medicine("Vitamin C", 20),
            new Medicine("Insulin", 3),
            new Medicine("Antibiotic", 12),
            new Medicine("Painkiller", 25)
        };

        System.out.println("Before Sorting:");
        for (Medicine m : medicines)
            System.out.println(m);

        MedWarehouse.mergeSort(medicines, 0, medicines.length - 1);

        System.out.println("\nSorted by Expiry (Urgent First):");
        for (Medicine m : medicines)
            System.out.println(m);

        // Alert for near expiry (≤ 7 days)
        System.out.println("\nNear Expiry Medicines:");
        for (Medicine m : medicines) {
            if (m.expiryDays <= 7) {
                System.out.println(m);
            }
        }
    }
}
