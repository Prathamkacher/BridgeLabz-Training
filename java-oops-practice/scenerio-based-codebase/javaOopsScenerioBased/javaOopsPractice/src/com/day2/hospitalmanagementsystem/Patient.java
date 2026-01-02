package com.day2.hospitalmanagementsystem;

class Patient {
    protected int patientId;
    protected String name;
    private String medicalHistory;   // sensitive data

    // Normal admission
    Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = "Not Provided";
    }

    // Emergency admission (constructor overloading)
    Patient(int patientId, String name, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = medicalHistory;
    }

    public String getSummary() {
        return "Patient ID: " + patientId + ", Name: " + name;
    }

    public void displayInfo() {
        System.out.println(getSummary());
    }
}

