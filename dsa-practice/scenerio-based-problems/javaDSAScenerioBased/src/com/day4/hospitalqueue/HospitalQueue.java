package com.day4.hospitalqueue;

public class HospitalQueue {

    public static void bubbleSort(Patient[] patients) {

        int n = patients.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                // Compare adjacent patients by criticality
                if (patients[j].criticality < patients[j + 1].criticality) {

                    // Swap full patient objects
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }
}
