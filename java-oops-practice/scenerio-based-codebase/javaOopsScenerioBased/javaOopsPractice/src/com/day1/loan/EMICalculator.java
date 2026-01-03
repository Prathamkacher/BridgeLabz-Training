package com.day1.loan;

public class EMICalculator {
	public double calculateEMI(Loan loan) {
		double monthlyRate = loan.getRate() / (12 * 100);
		int n = loan.getTenure();
		
		return (loan.getPricipal() * monthlyRate * Math.pow(1 + monthlyRate, n)) / (Math.pow(1 + monthlyRate, n) - 1);
	}
}
