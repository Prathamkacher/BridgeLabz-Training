package EmployeeSalarySystem;

public class Main {
    public static void main(String[] args) {

        SalaryCalculator s = new SalaryCalculator();

        System.out.println("Salary 1: " + s.calculateSalary(30000));
        System.out.println("Salary 2: " + s.calculateSalary(30000, 5000));
        System.out.println("Salary 3: " + s.calculateSalary(30000, 5000, 2000));
    }
}
