package com.objectmodelling.assistedproblems;

class Bank {
    private String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    String getBankName() {
        return bankName;
    }

    Account openAccount(Customer customer, double initialBalance) {
        Account account = new Account(this, initialBalance);
        customer.addAccount(account);
        return account;
    }
}
