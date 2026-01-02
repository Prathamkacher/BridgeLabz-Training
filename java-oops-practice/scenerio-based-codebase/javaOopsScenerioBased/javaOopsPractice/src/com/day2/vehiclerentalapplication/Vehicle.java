package com.day2.vehiclerentalapplication;

class Vehicle {
    protected int vehicleId;
    protected String brand;
    protected double baseRate;

    Vehicle(int vehicleId, String brand, double baseRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public String getVehicleInfo() {
        return "Vehicle ID: " + vehicleId + ", Brand: " + brand;
    }
}

