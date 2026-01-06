package com.day5.personalizedlearningplatform;

public class Instructor extends User {
	
	public Instructor(String name, String email, int userId) {
		super(name,email,userId);
	}
	
	public void createCourse() {
		System.out.println("Instructor " + name + " created a course.");
	}
}
