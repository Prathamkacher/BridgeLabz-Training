package com.day1.ambulanceroute;

public class AmbulanceMain {

    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        // Add units
        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.displayUnits();

        // Ambulance tries to find available unit
        System.out.println("\nAmbulance arriving...");
        route.findAvailableUnit();

        // Maintenance case
        System.out.println("\nSurgery under maintenance");
        route.removeUnit("Surgery");

        route.displayUnits();

        // Try again
        System.out.println("\nAmbulance arriving again...");
        route.findAvailableUnit();
    }
}
