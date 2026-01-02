package com.encapsulationandpolymorphism.patientmanager;

import java.util.ArrayList;
import java.util.List;

public class HospitalMain {

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        Patient p1 = new InPatient(101, "Aryaman", 22, 5, 3000);
        Patient p2 = new OutPatient(102, "Rohit", 30, 800);

        patients.add(p1);
        patients.add(p2);

        for (Patient patient : patients) {

            patient.getPatientDetails();
            System.out.println("Bill Amount: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord mr = (MedicalRecord) patient;
                mr.addRecord("Routine checkup completed");
                mr.viewRecords();
            }

            System.out.println("-----------------------------");
        }
    }
}
