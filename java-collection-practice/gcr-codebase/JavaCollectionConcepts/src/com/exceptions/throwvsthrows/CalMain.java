package com.exceptions.throwvsthrows;

public class CalMain {
	public static void main(String[] args) {

        try {
            double interest = InterestCalculator.calculateInterest(-1000, 5, 2);
            System.out.println("Calculated Interest: " + interest);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}
