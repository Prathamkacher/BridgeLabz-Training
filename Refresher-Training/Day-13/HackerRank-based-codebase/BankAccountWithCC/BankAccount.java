package BankAccountWithCC;

class BankAccount {

    String accountHolder;
    double balance;

    BankAccount() {
        this("Unknown", 0);
    }

    BankAccount(String accountHolder) {
        this(accountHolder, 0);
    }

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}