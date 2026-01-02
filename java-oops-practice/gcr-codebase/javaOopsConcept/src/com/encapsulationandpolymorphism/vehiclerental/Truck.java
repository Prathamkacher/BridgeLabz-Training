package com.encapsulationandpolymorphism.vehiclerental;

public class Truck extends Vehicle implements Insurable {

    public Truck(String number, double rate, String policyNo) {
        super(number, "Truck", rate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (rentalRate * days) + 1000; // heavy vehicle surcharge
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance (Policy: " + getInsurancePolicyNumber() + ")";
    }
}
