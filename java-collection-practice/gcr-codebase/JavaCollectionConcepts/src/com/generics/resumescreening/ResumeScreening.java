package com.generics.resumescreening;

import java.util.List;

public class ResumeScreening {

	public static void screenAll(List<? extends JobRole> roles) {
		for(JobRole role : roles) {
			System.out.println("AI screening for role: " + role.getRoleName());
		}
	}
}
