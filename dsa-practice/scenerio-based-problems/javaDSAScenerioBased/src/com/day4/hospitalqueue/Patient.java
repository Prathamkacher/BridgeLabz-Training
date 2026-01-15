package com.day4.hospitalqueue;

public class Patient {
    String name;
    int criticality;

    public Patient(String name, int criticality) {
        this.name = name;
        this.criticality = criticality;
    }

    @Override
    public String toString() {
        return name + " (Criticality: " + criticality + ")";
    }
}
