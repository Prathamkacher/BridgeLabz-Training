package com.objectmodelling.hospital;


import java.util.ArrayList;

public class Doctor {

    private String doctorName;
    private String specialization;
    private ArrayList<Patient> patients;

    public Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
        patients = new ArrayList<>();
    }

    // Communication method
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }

        System.out.println("Consultation Details:");
        System.out.println("Doctor  : " + doctorName);
        System.out.println("Specialization: " + specialization);
        System.out.println("Patient : " + patient.getPatientName());
        System.out.println();
    }

    public String getDoctorName() {
        return doctorName;
    }

    // View patients
    public void viewPatients() {
        System.out.println("Doctor: " + doctorName);
        System.out.println("Patients Consulted:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getPatientName());
        }
        System.out.println();
    }
}
