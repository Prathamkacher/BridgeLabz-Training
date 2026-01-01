package com.objectmodelling.hospital;


public class Main {

    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Care Hospital");

        Doctor d1 = new Doctor("Dr. Kumar", "Cardiology");
        Doctor d2 = new Doctor("Dr. Singh", "Neurology");

        Patient p1 = new Patient("Ramesh");
        Patient p2 = new Patient("Sita");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        hospital.showHospitalDetails();

        // Communication through consultation
        d1.consult(p1);
        d1.consult(p2);

        d2.consult(p1);

        // View relationships
        d1.viewPatients();
        d2.viewPatients();

        p1.viewDoctors();
        p2.viewDoctors();
    }
}

