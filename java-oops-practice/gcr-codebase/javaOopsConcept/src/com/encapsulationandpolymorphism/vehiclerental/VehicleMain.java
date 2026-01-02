package com.encapsulationandpolymorphism.vehiclerental;

import java.util.ArrayList;
import java.util.List;

public class VehicleMain {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("MH12AB1234", 2000, "CAR998877"));
        vehicles.add(new Bike("MH14XY5678", 500, "BIKE776655"));
        vehicles.add(new Truck("MH20TR9090", 5000, "TRK112233"));

        int days = 5;

        for (Vehicle vehicle : vehicles) {

            vehicle.displayVehicleDetails();

            double rent = vehicle.calculateRentalCost(days);
            double insurance = 0;

            if (vehicle instanceof Insurable) {
                Insurable ins = (Insurable) vehicle;
                insurance = ins.calculateInsurance();
                System.out.println(ins.getInsuranceDetails());
            }

            System.out.println("Rental Cost (" + days + " days): " + rent);
            System.out.println("Insurance Cost: " + insurance);
            System.out.println("Total Cost: " + (rent + insurance));
            System.out.println("------------------------------");
        }
    }
}
