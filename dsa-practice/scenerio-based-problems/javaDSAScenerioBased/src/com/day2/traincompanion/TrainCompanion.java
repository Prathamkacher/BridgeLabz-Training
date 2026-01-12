package com.day2.traincompanion;

public class TrainCompanion {
	private Node head = null;
	private Node current = null;
	
	//add compartment at end
	public void addCompartment(String name) {
		Node newNode = new Node(name);
		
		if (head == null) {
			head = newNode;
			current = newNode;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}
		System.out.println(name + " compartment added.");
	}
	
	//move forward
	public void moveNext() {
		if (current != null && current.next != null) {
			current = current.next;
			System.out.println("Moved to: " + current.name);
		}else {

			System.out.println("You are at the last Compartment");
		}
	}
	
	//move backward
	public void movePrev() {
		if (current != null && current.prev != null) {
			current = current.prev;
			System.out.println("Moved to: " + current.name);
		}else {

			System.out.println("You are at the first Compartment");
		}
	}
	
	//remove compartment
	public void removeCompartment(String name) {
		Node temp = head;
		
		while(temp != null) {
			if (temp.name.equals(name)) {
				if (temp.prev != null) {
					temp.prev.next = temp.next;
				}
				else {
					head = temp.next;
				}
				
				if (temp.next != null) {
					temp.next.prev = temp.prev;
				}
				
				System.out.println(name + " compartment removed."); 
				return;
			}
			temp = temp.next;
		}
		System.out.println("Compartment not found.");
	}
	
	//show adjacent compartment
	public void showAdjacent() {
		System.out.println("\nYou are currently at: " + current.name);
		
		//check if previous exist
		if (current.prev != null) {
			System.out.println("Previous: " + current.prev.name);
		}
		else {
			System.out.println("Previous: None");
		}
		
		//check if next exist
		if (current.next != null) {
			System.out.println("Next: " + current.next.name);
		}
		else {
			System.out.println("Next: None");
		}
	}
	
	//display full train
	public void displayTrain() {
		Node temp = head;
		System.out.println("\nTrain Compartments:");
		while(temp != null) {
			System.out.print(temp.name + " = ");
			temp = temp.next;
		}
		System.out.println("END\n");
	}
}
