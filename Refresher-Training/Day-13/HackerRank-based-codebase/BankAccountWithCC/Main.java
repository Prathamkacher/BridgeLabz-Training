package BankAccountWithCC;

public class Main {

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount("Pratham");
        BankAccount a3 = new BankAccount("Krishna", 5000);

        SavingsAccount s = new SavingsAccount("Raj", 10000, 5);

        s.display();
    }
}