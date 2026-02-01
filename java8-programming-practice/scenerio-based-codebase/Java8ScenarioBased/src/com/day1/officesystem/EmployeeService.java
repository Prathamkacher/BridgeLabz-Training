package com.day1.officesystem;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeService {

	public static Function<Employee, Double> calculateBonus = b -> b.getSalary() > 30000 ? b.getSalary() * 0.10 : 0.0;
	
	public static Comparator<Employee> sortBySalary = (s1, s2) -> Double.compare(s1.getSalary(), s2.getSalary());
	
	public static Predicate<Employee> promotionEligible = p -> p.getExperience() > 3;
	
	public static Consumer<Employee> employeeDetail = e -> System.out.println(e);
	
	public static BiFunction<Employee, Employee, String> compareSalary = (e1, e2) -> {
		if(e1.getSalary() > e2.getSalary()) return e1.getName() + " earns more.";
		else if(e2.getSalary() > e1.getSalary()) return e2.getName() + " earns more.";
		else return "Both ears same salary";
	};
}
