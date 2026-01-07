package com.day6.loanbuddy;

class AutoLoan extends Loan {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, "Auto Loan", term, 10.5);
    }

    @Override
    public double calculateEMI() {
        // Auto loans have processing surcharge
        return basicEMI(applicant.getLoanAmount() + 10000, interestRate, term);
    }
}
