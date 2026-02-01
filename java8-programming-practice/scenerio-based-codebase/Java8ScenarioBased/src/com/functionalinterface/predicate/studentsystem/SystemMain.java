package com.functionalinterface.predicate.studentsystem;

import java.util.function.Predicate;

public class SystemMain {
	
	public static void checkEligibility(Student student, Predicate<Student> rule) {
		if(rule.test(student)) {
			System.out.println(student.getName() + " is eligible for exam!");
		} else {
			System.out.println(student.getName() + " is not eligible for exam!");
		}
	}
	
	public static void main(String[] args) {
        Student s1 = new Student("Rahul", 82);
        Student s2 = new Student("Priya", 74);
        Student s3 = new Student("Amit", 90);
        
        Predicate<Student> isEligible = student -> student.getAttendance() >= 75;
        
        checkEligibility(s1, isEligible);
        checkEligibility(s2, isEligible);
        checkEligibility(s3, isEligible);
        
	}

}
