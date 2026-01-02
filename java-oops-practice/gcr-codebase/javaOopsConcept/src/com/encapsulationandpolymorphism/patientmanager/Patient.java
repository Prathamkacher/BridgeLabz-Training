package com.encapsulationandpolymorphism.patientmanager;

public abstract class Patient {

    // Encapsulated basic details
    private int patientId;
    private String name;
    private int age;

    // Sensitive medical data (encapsulated)
    private String diagnosis;
    private String medicalHistory;

    // Constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Controlled access to sensitive data
    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected void setMedicalHistory(String history) {
        this.medicalHistory = history;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    protected String getMedicalHistory() {
        return medicalHistory;
    }
}
