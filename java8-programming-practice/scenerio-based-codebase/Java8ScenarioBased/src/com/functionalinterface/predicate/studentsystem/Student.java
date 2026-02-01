package com.functionalinterface.predicate.studentsystem;

public class Student {

	private String name;
	private double attendance;
	
	public Student(String name, double attendance) {
		this.name = name;
		this.attendance = attendance;
	}
	
	public String getName() {
		return name;
	}
	
	public double getAttendance() {
		return attendance;
	}
}
