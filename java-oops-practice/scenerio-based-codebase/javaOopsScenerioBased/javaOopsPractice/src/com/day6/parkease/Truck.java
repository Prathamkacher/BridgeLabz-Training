package com.day6.parkease;

class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 100);
    }

    @Override
    public double calculateCharges(int hours) {
        int allowedHours = 5;
        double penalty = hours > allowedHours ? (hours - allowedHours) * 50 : 0;
        return (baseRate * hours) + penalty;
    }
}
