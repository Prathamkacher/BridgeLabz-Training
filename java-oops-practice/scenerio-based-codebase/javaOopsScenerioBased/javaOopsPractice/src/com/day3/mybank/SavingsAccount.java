package com.day3.mybank;

class SavingsAccount extends Account {

    private static final double INTEREST_RATE = 4.0;

    SavingsAccount(String accNo) {
        super(accNo);
    }

    SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    void calculateInterest() {
        double interest = getBalanceValue() * INTEREST_RATE / 100;
        setBalance(getBalanceValue() + interest);
        System.out.println("Savings Interest Added: ₹" + interest);
    }
}
