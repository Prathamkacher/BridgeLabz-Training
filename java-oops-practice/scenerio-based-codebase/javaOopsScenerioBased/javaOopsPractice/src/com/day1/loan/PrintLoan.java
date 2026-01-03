package com.day1.loan;

public class PrintLoan {
	public void printDetails(Loan loan, double emi) {
		System.out.println("Loan Amount: " + loan.getPricipal());
		System.out.println("Interest rate: " + loan.getRate());
		System.out.println("Tenure (Months): " + loan.getTenure());
		System.out.println("Monthly EMI: " + emi);

	}
}
