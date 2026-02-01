package com.day1.officesystem;

public class Employee {

	private String name;
	private double salary;
	private int experience;
	
	public Employee(String name, double salary, int experience) {
		this.name = name;
		this.salary = salary;
		this.experience = experience;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getExperience() {
		return experience;
	}
	
	@Override
	public String toString() {
		return name + " | Salary: " + salary + " | Experience: " + experience;
	}
}
