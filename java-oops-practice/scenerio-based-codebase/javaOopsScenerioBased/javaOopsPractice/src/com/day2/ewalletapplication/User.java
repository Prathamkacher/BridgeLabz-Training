package com.day2.ewalletapplication;

class User {
    private int userId;
    private String name;
    private Wallet wallet;

    User(int id, String name, Wallet wallet) {
        this.userId = id;
        this.name = name;
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public String getName() {
        return name;
    }
}
