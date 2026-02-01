package com.day1.schoolsystem;

import java.util.Arrays;
import java.util.List;

public class SystemMain {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student("Pratham", 22, 100, 2),
				new Student("Kartik", 28, 90, 4),
				new Student("Aryan", 22, 80, 8),
				new Student("Gaurav", 15, 20, 6)
		);
		
		list.forEach(StudentService.welcome);
		
		list.forEach(s -> System.out.println(s.getName() + " Pass ? " + StudentService.isPass.test(s)));
		
		System.err.println("----- Sort By Name -----");
		
		list.stream().sorted(StudentService.byName).forEach(System.out::println);
		
		System.err.println("----- Sort By Rank -----");
		
		list.stream().sorted(StudentService.byRank).forEach(System.out::println);
		
		System.err.println("----- Filter By Age -----");
		
		list.stream().filter(StudentService.above18).forEach(System.out::println);
	}
}
