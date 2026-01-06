package com.day5.personalizedlearningplatform;

public class Learner extends User implements ICertifiable {
	
	private String courseType;
	
	public Learner(String name, String email, int userId, String courseType) {
		super(name,email,userId);
		this.courseType = courseType;
	}
	
	public void generateCertificate() {
		if (courseType.equalsIgnoreCase("short")) {
			System.out.println("Short Course Certificate generated for " + name);
		}
		else {
			System.out.println("Full-Time Course Certificate generated for " + name);
		}
	}
}