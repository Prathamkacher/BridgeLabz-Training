/*
 * 5. TrainCompanion – Compartment Navigation System (Doubly Linked
List)
Story: In a long-distance train app, passengers can walk to the next or previous compartment,
or search for services (like pantry, WiFi). Each compartment is a node in a Doubly Linked List.
Requirements:
● Traverse forward or backward.
● Insert/Remove compartments dynamically.
● Display adjacent compartments for quick decisions.
 */

package com.day2.traincompanion;

public class TrainCompanionMain {
	public static void main(String[] args) {
		TrainCompanion train = new TrainCompanion();
		
		train.addCompartment("Engine");
        train.addCompartment("Sleeper");
        train.addCompartment("AC");
        train.addCompartment("Pantry");
        train.addCompartment("General");
        
        train.displayTrain();
        
        train.moveNext();
        train.moveNext();
        
        train.showAdjacent();
        
        train.removeCompartment("Pantry");
        
        train.displayTrain();
        
        train.moveNext();
        train.showAdjacent();
	}
}
