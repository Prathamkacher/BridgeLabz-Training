package com.day2.ewalletapplication;

class PersonalWallet extends Wallet {

    PersonalWallet(String id) {
        super(id);
    }

    PersonalWallet(String id, double bonus) {
        super(id, bonus);
    }

    // No extra charges
}
