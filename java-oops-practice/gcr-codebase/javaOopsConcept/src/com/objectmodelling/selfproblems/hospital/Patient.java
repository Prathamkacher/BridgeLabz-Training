package com.objectmodelling.hospital;

import java.util.ArrayList;

public class Patient {

    private String patientName;
    private ArrayList<Doctor> doctors;

    public Patient(String patientName) {
        this.patientName = patientName;
        doctors = new ArrayList<>();
    }

    // Association: patient linked to doctor
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public String getPatientName() {
        return patientName;
    }

    // View consulted doctors
    public void viewDoctors() {
        System.out.println("Patient: " + patientName);
        System.out.println("Consulted Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.getDoctorName());
        }
        System.out.println();
    }
}
