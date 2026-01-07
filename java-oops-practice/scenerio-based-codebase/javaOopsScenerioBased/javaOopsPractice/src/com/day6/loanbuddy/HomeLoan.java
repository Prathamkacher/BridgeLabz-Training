package com.day6.loanbuddy;

class HomeLoan extends Loan {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, "Home Loan", term, 8.5);
    }

    @Override
    public double calculateEMI() {
        // Home loans get slight interest benefit
        return basicEMI(applicant.getLoanAmount(), interestRate - 0.5, term);
    }
}
