package com.day1.loan;

public class Loan {
	private double principal;
	private double rate;
	private int tenure;
	
	public Loan(double principal, double rate, int tenure) {
		this.principal = principal;
		this.rate = rate;
		this.tenure = tenure;
	}
	
	public double getPricipal() {
		return principal;
	}
	
	public double getRate() {
		return rate;
	}
	
	public int getTenure() {
		return tenure;
	}
}
