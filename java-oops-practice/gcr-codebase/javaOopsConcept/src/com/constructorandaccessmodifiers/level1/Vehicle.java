package com.constructorandaccessmodifiers.level1;

public class Vehicle {

	// Instance variables
    String ownerName;
    String vehicleType;

    // Class variable (shared by all vehicles)
    static double registrationFee = 5000.0;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println(
            "Owner Name: " + ownerName +
            ", Vehicle Type: " + vehicleType +
            ", Registration Fee: ₹" + registrationFee
        );
    }

    // Class method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Aryaman", "Car");
        Vehicle v2 = new Vehicle("Rohit", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(6500.0);

        System.out.println("\nAfter updating registration fee:\n");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }

}
