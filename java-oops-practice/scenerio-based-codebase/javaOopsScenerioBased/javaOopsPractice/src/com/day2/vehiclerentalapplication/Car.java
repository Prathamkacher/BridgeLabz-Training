package com.day2.vehiclerentalapplication;

class Car extends Vehicle implements Rentable {

    Car(int id, String brand, double baseRate) {
        super(id, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        double insurance = 500;
        return (baseRate * days) + insurance;
    }
}