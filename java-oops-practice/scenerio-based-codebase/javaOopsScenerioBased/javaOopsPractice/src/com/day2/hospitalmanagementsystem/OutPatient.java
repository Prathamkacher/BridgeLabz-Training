package com.day2.hospitalmanagementsystem;

class OutPatient extends Patient {
    private String visitDate;

    OutPatient(int id, String name, String visitDate) {
        super(id, name);
        this.visitDate = visitDate;
    }

    @Override
    public void displayInfo() {
        System.out.println(getSummary() + ", Visit Date: " + visitDate);
    }
}
