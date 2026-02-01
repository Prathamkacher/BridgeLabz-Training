package com.day1.schoolsystem;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StudentService {

	public static Consumer<Student> welcome = name -> System.out.println("Welcome to school: " + name.getName() + " !");
	
	public static Predicate<Student> isPass = marks -> marks.getMarks() >= 40;
	
	public static Comparator<Student> byName = (n1, n2) -> n1.getName().compareTo(n2.getName());
	
	public static Comparator<Student> byRank = (r1, r2) -> Integer.compare(r1.getRank(), r2.getRank());
	
	public static Predicate<Student> above18 = s -> s.getAge() > 18;
}
