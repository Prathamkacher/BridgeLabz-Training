package com.generics.resumescreening;

public class Resume<T extends JobRole> {

	private String candidateName;
	private T jobRole;
	
	public Resume(String candidateName, T jobRole) {
		this.candidateName = candidateName;
		this.jobRole = jobRole;
	}
	
	public T getJobRole() {
		return jobRole;
	}
	
	public void display() {
		System.out.println(candidateName + " applied for " + jobRole.getRoleName());
	}
}
