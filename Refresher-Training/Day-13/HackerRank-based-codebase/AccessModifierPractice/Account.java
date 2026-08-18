package AccessModifierPractice;

public class Account {
    private double balance = 5000;

    protected double getBalance() {
        return balance;
    }
}

class CurrentAccount extends Account {

    void showBalance() {
        System.out.println("Balance: " + getBalance());
    }
}
