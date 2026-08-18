package EmployeeSalarySystem;

public class SalaryCalculator {
    double calculateSalary(double basic) {
        return basic;
    }

    double calculateSalary(double basic, double bonus) {
        return basic + bonus;
    }

    double calculateSalary(double basic, double bonus, double deduction) {
        return basic + bonus - deduction;
    }
}
