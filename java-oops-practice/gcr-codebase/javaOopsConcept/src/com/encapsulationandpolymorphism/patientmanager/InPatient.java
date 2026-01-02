package com.encapsulationandpolymorphism.patientmanager;

public class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int id, String name, int age, int days, double charge) {
        super(id, name, age);
        this.daysAdmitted = days;
        this.dailyCharge = charge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void addRecord(String record) {
        setMedicalHistory(record);
        System.out.println("In-patient medical record updated");
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History: " + getMedicalHistory());
    }
}
