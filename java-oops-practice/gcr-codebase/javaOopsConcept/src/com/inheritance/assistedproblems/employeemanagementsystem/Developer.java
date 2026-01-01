package com.inheritance.assistedproblems.employeemanagementsystem;

public class Developer extends Employee {
	String programmingLang;
	
	Developer(String name, int id, double salary, String programmingLang) {
		super(name, id, salary);
		this.programmingLang = programmingLang;
	}
	
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Programming Language: " + programmingLang);
	}
}
