/*
 6. "CabbyGo – A Ride-Hailing App in the Making"
Story: You’ve joined a startup building CabbyGo, a ride-hailing app. You're tasked with building
the backend logic for managing vehicles, drivers, and ride booking.
Requirements:
● Vehicle (class): fields like vehicleNumber, capacity, type.
● Driver (class): fields like name, licenseNumber, rating.
● Constructors to initialize vehicles and drivers.
● An IRideService interface with methods like bookRide() and endRide().
● Use encapsulation to hide sensitive data like location, fare.
● Implement polymorphism with different vehicle types like Mini, Sedan, SUV (all extend
Vehicle).

● Use operators to calculate fare: baseFare + distance * rate.d
 */

package com.day3.cabbygo;

public class Main {
    public static void main(String[] args) {

        IRideService miniRide = new Mini("MH12AB1234");
        IRideService sedanRide = new Sedan("MH14CD5678");

        Driver driver1 = new Driver("Rohit", "LIC12345", 4.8);

        driver1.showDriver();

        miniRide.bookRide(10);   // 10 km
        miniRide.endRide();

        sedanRide.bookRide(8);   // 8 km
        sedanRide.endRide();
    }
}
