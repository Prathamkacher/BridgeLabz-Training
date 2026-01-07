package com.day6.loanbuddy;

public class LoanBuddyMain {
    public static void main(String[] args) {

        Applicant applicant =
                new Applicant("Aryaman", 720, 80000, 500000);

        Loan loan = new HomeLoan(applicant, 240); // Polymorphism

        if (loan.approveLoan()) {
            System.out.println("Loan Approved ✅");
            System.out.println("Monthly EMI: ₹" + loan.calculateEMI());
        } else {
            System.out.println("Loan Rejected ❌");
        }
    }
}
