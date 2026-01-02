package com.encapsulationandpolymorphism.ridehailing;

import java.util.List;

public class FareCalculator {

    public static void calculateFares(List<Vehicle> vehicles, double distance) {

        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Distance: " + distance + " km");
            System.out.println("Fare: " + v.calculateFare(distance));
            System.out.println("---------------------------");
        }
    }
}
