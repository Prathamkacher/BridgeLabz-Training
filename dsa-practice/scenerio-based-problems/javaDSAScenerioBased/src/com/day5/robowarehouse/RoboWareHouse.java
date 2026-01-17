package com.day5.robowarehouse;

import java.util.ArrayList;

public class RoboWareHouse {
	private ArrayList<Package> shelf = new ArrayList<>();
	
	//add package and keep shelf sorted
	public void addPackage(int weight) {
		Package p = new Package(weight);
		shelf.add(p);
		
		int i = shelf.size() - 1;
		
		while(i > 0 && shelf.get(i-1).weight > shelf.get(i).weight) {
			Package temp = shelf.get(i);
			shelf.set(i, shelf.get(i - 1));
			shelf.set(i-1, temp);
			
			i--;
		}
		System.out.println("Added: " + weight + "kg");
	}
	
	public void displayShelf() {
        System.out.println("Shelf state: " + shelf);
    }
}