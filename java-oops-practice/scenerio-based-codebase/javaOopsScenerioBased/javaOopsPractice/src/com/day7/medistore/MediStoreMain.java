/*
 * 17. "MediStore – Pharmacy Inventory & Sales System"
Story: A pharmacy chain needs an app to manage drug inventory, sales, and expiry tracking.
Requirements:
● Medicine class: name, price, expiryDate, quantity.
● Interface ISellable with sell() and checkExpiry() methods.
● Constructors for medicines with default quantity.
● Use operators: total price, discount, stock adjustments.
● Encapsulation: internal stock and cost details are hidden.
● Inheritance: Tablet, Syrup, Injection extend Medicine.
● Polymorphism: checkExpiry() works differently for preserved vs liquid meds.
● Access Modifiers: make sensitive pricing logic private.
 */

package com.day7.medistore;

public class MediStoreMain {
	
	public static void main (String[] args) {
		
		Medicine med1 = new Tablet("Paracetamol", 2.5, "12-9-2026", 50);
		Medicine med2 = new Syrup("Cought Syrup", 85, "12-11-2026", 20);
		
		med1.sell(5);
		med1.checkExpiry();
		
		med2.sell(2);
		med2.checkExpiry();
	}
}
