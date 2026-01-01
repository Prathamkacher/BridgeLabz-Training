package com.objectmodelling.hospital;

import java.util.ArrayList;

public class Hospital {

    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showHospitalDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("\nDoctors Available:");
        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.getDoctorName());
        }

        System.out.println("\nRegistered Patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getPatientName());
        }
        System.out.println();
    }
}

