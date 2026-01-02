package com.encapsulationandpolymorphism.ridehailing;

public abstract class Vehicle {

    // Encapsulated fields
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }

    // Protected getter for subclasses
    protected double getRatePerKm() {
        return ratePerKm;
    }
}
