package com.day3.cabbygo;

class Vehicle implements IRideService {
    protected String vehicleNumber;
    protected int capacity;
    protected String type;

    private double fare;        // sensitive
    private String location;    // sensitive

    protected double ratePerKm;

    Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.ratePerKm = ratePerKm;
        this.location = "Unknown";
    }

    protected void calculateFare(double distance) {
        double baseFare = 50;
        fare = baseFare + distance * ratePerKm;
    }

    public double getFare() {
        return fare;
    }

    @Override
    public void bookRide(double distance) {
        calculateFare(distance);
        System.out.println(type + " booked | Fare: ₹" + fare);
    }

    @Override
    public void endRide() {
        System.out.println(type + " ride ended.");
    }
}
