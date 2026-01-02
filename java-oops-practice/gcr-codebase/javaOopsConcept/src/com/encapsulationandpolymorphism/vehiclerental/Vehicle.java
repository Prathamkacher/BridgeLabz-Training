package com.encapsulationandpolymorphism.vehiclerental;

public abstract class Vehicle {

    // Encapsulated fields
    private String vehicleNumber;
    private String type;
    protected double rentalRate;   // per day

    // Sensitive detail (encapsulated)
    private String insurancePolicyNumber;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate, String policyNo) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = policyNo;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    // Concrete method
    public void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
    }

    // Encapsulation: no direct access to policy number
    protected String getInsurancePolicyNumber() {
        return "****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }

    public double getRentalRate() {
        return rentalRate;
    }
}
