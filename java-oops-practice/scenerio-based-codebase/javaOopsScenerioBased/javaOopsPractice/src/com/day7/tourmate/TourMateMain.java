/*
18. "TourMate – Travel Itinerary Planner"
Story: TourMate helps travelers plan and book trips by organizing activities, transportation, and
stays.
Requirements :

● Trip class: destination, budget, duration.
● Transport, Hotel, Activity are associated.
● Interface IBookable with book() and cancel() methods.
● Encapsulation: hide cost breakdown inside services.
● Use constructors to generate complete trip packages.
● Operators: total budget = hotel + transport + activities.
● Inheritance: InternationalTrip, DomesticTrip extend Trip.
● Polymorphism: book() logic differs based on trip type.
 */

package com.day7.tourmate;

public class TourMateMain {

	public static void main(String[] args) {
		Transport flight = new Transport(15000);
		Hotel airBNB = new Hotel(3000, 5);
		Activity rafting = new Activity(5000);
		
		
		Trip trip1 = new DomesticTrip("Manali", 5, flight, airBNB, rafting);
		
		trip1.showTripDetails();
		trip1.book();
		trip1.cancel();
		
		System.out.println();
		
		Trip trip2 = new InternationalTrip("Malaysia", 7, flight, airBNB, rafting);
		
		trip2.showTripDetails();
		trip2.book();

	}
}
