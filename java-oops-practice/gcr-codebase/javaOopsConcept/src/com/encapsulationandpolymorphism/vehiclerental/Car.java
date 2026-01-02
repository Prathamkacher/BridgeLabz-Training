package com.encapsulationandpolymorphism.vehiclerental;

public class Car extends Vehicle implements Insurable {

    public Car(String number, double rate, String policyNo) {
        super(number, "Car", rate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 500; // flat insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance (Policy: " + getInsurancePolicyNumber() + ")";
    }
}
