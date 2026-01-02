package com.encapsulationandpolymorphism.ridehailing;

import java.util.ArrayList;
import java.util.List;

public class RideMain {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car(1, "Amit", 15));
        vehicles.add(new Bike(2, "Ravi", 10));
        vehicles.add(new Auto(3, "Suresh", 12));

        FareCalculator.calculateFares(vehicles, 8.5);
    }
}
