package com.generics.resumescreening;

import java.util.Arrays;
import java.util.List;

public class ResumeScreeningMain {

	public static void main(String[] args) {
		
		Resume<SoftwareEngineer> role1 = new Resume<>("Aryaman", new SoftwareEngineer());
		Resume<DataScientist> role2 = new Resume<>("Pratham", new DataScientist());
		Resume<ProductManager> role3 = new Resume<>("Krishna", new ProductManager());
		
		role1.display();
		role2.display();
		role3.display();
		
		List<JobRole> roles = Arrays.asList(
				new SoftwareEngineer(),
				new DataScientist(),
				new ProductManager()
		);
		
		ResumeScreening.screenAll(roles);
	}
}
