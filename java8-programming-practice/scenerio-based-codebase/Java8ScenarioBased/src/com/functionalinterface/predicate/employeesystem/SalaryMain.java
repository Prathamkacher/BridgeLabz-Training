package com.functionalinterface.predicate.employeesystem;

import java.util.function.Predicate;

public class SalaryMain {

	public static void checkSalary(Employee emp, Predicate<Employee> rule) {
		if(rule.test(emp)) {
			System.out.println(emp.getName() + " earns greater than 30000");
		} else {
			System.out.println(emp.getName() + " earns less than 30000");
		}
	}
	
	public static void main(String[] args) {

        Employee e1 = new Employee("Arjun", 45000);
        Employee e2 = new Employee("Neha", 28000);
        Employee e3 = new Employee("Ravi", 32000);
        
        Predicate<Employee> isSalaryHigh = employee -> employee.getSalary() > 30000;
        
        checkSalary(e1, isSalaryHigh);
        checkSalary(e2, isSalaryHigh);
        checkSalary(e3, isSalaryHigh);
        
        
	}
}
