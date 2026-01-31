package com.collectors.studentresultgrouping;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
			new Student("Pratham", "A"),
			new Student("Prashant", "B"),
			new Student("Aryaman", "A"),
			new Student("Krishna", "B"),
			new Student("Gautam G", "A"),
			new Student("Krishna T", "C")
		);
		
		students.stream()
			.collect(Collectors.groupingBy(
					Student::getGrade,
					Collectors.mapping(
							Student::getName,
							Collectors.toList()
					)
			))
			.forEach((grade, names) -> 
			System.out.println("Grade " + grade + " - " + names));
	}
}
