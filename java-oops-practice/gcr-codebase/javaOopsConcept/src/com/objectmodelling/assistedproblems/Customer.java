package com.objectmodelling.assistedproblems;
import java.util.ArrayList;

class Customer {
    private String name;
    private ArrayList<Account> accounts;

    Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (Account acc : accounts) {
            System.out.println(
                acc.getBank().getBankName() + " : ₹" + acc.getBalance()
            );
        }
    }
}
