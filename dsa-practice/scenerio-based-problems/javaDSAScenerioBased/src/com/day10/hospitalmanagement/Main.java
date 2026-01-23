package com.day10.hospitalmanagement;

public class Main {
    public static void main(String[] args) {

        HospitalAVL hospital = new HospitalAVL();

        hospital.register(1, "Rahul", 930);
        hospital.register(2, "Anita", 1015);
        hospital.register(3, "Suresh", 845);
        hospital.register(4, "Pooja", 1100);

        hospital.displayPatients();

        hospital.discharge(1015); // Anita discharged

        hospital.displayPatients();
    }
}
