package com.day8.skillforge;

public class Student extends User implements ICertifiable{
	private int completedModules ; 
	
	public Student(String name, String email) {
		super(name, email);
		this.completedModules = 0;
	}
	
	public void completeModule() {
		completedModules++;
	}
	
	public int getCompletedModules() {
        return completedModules;
    }
	
	@Override
    public void generateCertificate(Course course) {
        int progress = (completedModules * 100) / course.getTotalModules();

        if (progress == 100) {
            if (course.getLevel().equalsIgnoreCase("Beginner")) {
                System.out.println("Beginner Course Certificate awarded to " + name);
            } else {
                System.out.println("Advanced Course Certificate awarded to " + name);
            }
        } else {
            System.out.println("Course not yet completed. Certificate not generated.");
        }
    }
}
