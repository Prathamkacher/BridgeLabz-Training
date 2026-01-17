/*
 *  10. FleetManager – Vehicle Maintenance Scheduler (Merge Sort)
Story: A fleet company schedules vehicle maintenance based on mileage. Each depot sends a
sorted list of vehicles. To create a master schedule, Merge Sort is used to combine these depot
lists efficiently.
Key Concepts:
● Sorted sublists from multiple sources
● Merge sort for final master list
● Efficient memory usage for large lists
 */

package com.day6.fleetmanager;

public class FleetMain {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Vehicle("Truck1", 10000),
            new Vehicle("Truck2", 15000),
            new Vehicle("Truck3", 20000),
            new Vehicle("Van1", 12000),
            new Vehicle("Van2", 14000),
            new Vehicle("Van3", 25000)
        };

        System.out.println("Before Sorting:");
        for (Vehicle v : vehicles)
            System.out.println(v);

        FleetManager.mergeSort(vehicles, 0, vehicles.length - 1);

        System.out.println("\nMaster Maintenance Schedule:");
        for (Vehicle v : vehicles)
            System.out.println(v);
    }
}
