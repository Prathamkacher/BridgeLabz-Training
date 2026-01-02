package com.day2.vehiclerentalapplication;

class Truck extends Vehicle implements Rentable {

    Truck(int id, String brand, double baseRate) {
        super(id, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        double loadCharge = 1000;
        return (baseRate * days) + loadCharge;
    }
}

