package com.day2.ewalletapplication;

class BusinessWallet extends Wallet {

    BusinessWallet(String id, double bonus) {
        super(id, bonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * 0.02;   // 2% business tax
        double total = amount + tax;

        if (deductMoney(total)) {
            receiver.getWallet().addMoney(amount);
            System.out.println("Business Transfer ₹" + amount +
                               " (Tax ₹" + tax + ")");
        } else {
            System.out.println("Insufficient balance for business transfer");
        }
    }
}
