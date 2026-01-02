package com.day2.vehiclerentalapplication;

class Customer {
    private int customerId;
    private String name;

    Customer(int id, String name) {
        this.customerId = id;
        this.name = name;
    }

    public void rentVehicle(Rentable vehicle, int days) {
        System.out.println("Customer: " + name);
        System.out.println("Total Rent for " + days + " days: ₹" +
                vehicle.calculateRent(days));
    }
}
