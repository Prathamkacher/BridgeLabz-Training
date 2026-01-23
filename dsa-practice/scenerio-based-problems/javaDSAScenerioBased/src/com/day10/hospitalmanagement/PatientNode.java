package com.day10.hospitalmanagement;

public class PatientNode {
    int patientId;
    String name;
    int checkInTime;   // e.g., 930 = 9:30 AM
    int height;

    PatientNode left, right;

    PatientNode(int patientId, String name, int checkInTime) {
        this.patientId = patientId;
        this.name = name;
        this.checkInTime = checkInTime;
        this.height = 1;
    }
}
