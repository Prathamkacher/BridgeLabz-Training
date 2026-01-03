package com.day3.mybank;

class CurrentAccount extends Account {

    private static final double INTEREST_RATE = 1.0;

    CurrentAccount(String accNo) {
        super(accNo);
    }

    CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    void calculateInterest() {
        double interest = getBalanceValue() * INTEREST_RATE / 100;
        setBalance(getBalanceValue() + interest);
        System.out.println("Current Account Interest Added: ₹" + interest);
    }
}
