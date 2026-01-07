package com.day6.loanbuddy;

class LoanApplication {
    protected String loanType;
    protected int term; // in months
    protected double interestRate;

    public LoanApplication(String loanType, int term, double interestRate) {
        this.loanType = loanType;
        this.term = term;
        this.interestRate = interestRate;
    }
}
