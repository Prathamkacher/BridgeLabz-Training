package com.day4.zipzipmart;

public class ZipZipMartMain {

    public static void main(String[] args) {

        Transaction[] records = {
            new Transaction("2024-08-01", 500),
            new Transaction("2024-07-30", 1200),
            new Transaction("2024-08-01", 300),
            new Transaction("2024-07-29", 700),
            new Transaction("2024-08-02", 900)
        };

        System.out.println("Before Sorting:");
        for (Transaction t : records)
            System.out.println(t);

        ZipZipMart.mergeSort(records, 0, records.length - 1);

        System.out.println("\nAfter Sorting (by Date, then Amount):");
        for (Transaction t : records)
            System.out.println(t);
    }
}
