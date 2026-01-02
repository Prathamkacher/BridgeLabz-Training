package com.day2.ewalletapplication;

class Wallet implements Transferrable {
    protected String walletId;
    private double balance;

    // Normal wallet
    Wallet(String walletId) {
        this.walletId = walletId;
        this.balance = 0;
    }

    // Wallet with referral bonus
    Wallet(String walletId, double referralBonus) {
        this.walletId = walletId;
        this.balance = referralBonus;
    }

    public double getBalance() {
        return balance;
    }

    protected void addMoney(double amount) {
        balance += amount;
    }

    protected boolean deductMoney(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (deductMoney(amount)) {
            receiver.getWallet().addMoney(amount);
            System.out.println("Transferred ₹" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
