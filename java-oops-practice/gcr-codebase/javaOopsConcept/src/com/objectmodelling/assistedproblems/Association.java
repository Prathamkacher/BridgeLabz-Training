package com.objectmodelling.assistedproblems;

public class Association{
    public static void main(String[] args) {

        Bank sbi = new Bank("SBI");
        Bank hdfc = new Bank("HDFC");

        Customer arya = new Customer("Arya");

        sbi.openAccount(arya, 5000);
        hdfc.openAccount(arya, 12000);

        arya.viewBalance();
    }
}
