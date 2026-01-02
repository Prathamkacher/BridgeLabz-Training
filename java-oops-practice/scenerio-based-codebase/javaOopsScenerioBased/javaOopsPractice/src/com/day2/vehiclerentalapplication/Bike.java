package com.day2.vehiclerentalapplication;

class Bike extends Vehicle implements Rentable {

    Bike(int id, String brand, double baseRate) {
        super(id, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;   // no extra charges
    }
}
