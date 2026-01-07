package com.day6.loanbuddy;

abstract class Loan extends LoanApplication implements IApprovable {

    protected Applicant applicant;
    private boolean approved; // status hidden from outside

    public Loan(Applicant applicant, String loanType, int term, double interestRate) {
        super(loanType, term, interestRate);
        this.applicant = applicant;
    }

    // Approval logic hidden inside
    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 650 &&
            applicant.getIncome() >= applicant.getLoanAmount() / 10) {
            approved = true;
        } else {
            approved = false;
        }
        return approved;
    }

    protected boolean isApproved() {
        return approved;
    }

    // EMI formula (common utility)
    protected double basicEMI(double principal, double rate, int months) {
        double r = rate / (12 * 100);
        return principal * r * Math.pow(1 + r, months)
                / (Math.pow(1 + r, months) - 1);
    }

    public abstract double calculateEMI();
}
