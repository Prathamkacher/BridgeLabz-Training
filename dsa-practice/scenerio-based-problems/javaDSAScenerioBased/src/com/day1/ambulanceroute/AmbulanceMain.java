/*
 * 3. AmbulanceRoute – Emergency Patient Navigation (Circular Linked List)
Story: In a hospital, there are multiple buildings connected in a circular fashion:
Emergency → Radiology → Surgery → ICU → Emergency. When an ambulance is bringing in patients, it follows a Circular Linked List to decide the nearest available unit for emergency treatment.
Requirements:
● Each node represents a hospital unit.
● Rotate through units until an available one is found.
● Simulate patient redirection in a circular path.
● Remove a unit if it's under maintenance.
 */

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
