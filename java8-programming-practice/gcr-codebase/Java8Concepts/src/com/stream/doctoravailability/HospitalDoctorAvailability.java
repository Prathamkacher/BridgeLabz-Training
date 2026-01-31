package com.stream.doctoravailability;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HospitalDoctorAvailability {

    public static void main(String[] args) {

        List<Doctor> doctors = List.of(
                new Doctor("Dr. Ananya Rao", "Cardiology", true),
                new Doctor("Dr. Rahul Mehta", "Orthopedics", false),
                new Doctor("Dr. Priya Sharma", "Dermatology", true),
                new Doctor("Dr. Vikram Singh", "Neurology", true),
                new Doctor("Dr. Neha Kapoor", "Pediatrics", false),
                new Doctor("Dr. Arjun Iyer", "Cardiology", true)
        );

        System.out.println("Doctors Available on Weekends (Sorted by Specialty)");
        System.out.println("--------------------------------------------------");

        List<Doctor> weekendDoctors = doctors.stream()
                .filter(Doctor::isAvailableOnWeekend)
                .sorted(Comparator.comparing(Doctor::getSpecialty))
                .collect(Collectors.toList());

        for (Doctor doctor : weekendDoctors) {
            System.out.printf("%-20s %-15s%n",
                    doctor.getName(),
                    doctor.getSpecialty());
        }
    }
}
