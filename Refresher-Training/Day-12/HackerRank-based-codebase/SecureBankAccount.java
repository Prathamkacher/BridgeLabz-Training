public class BankAccount {

    private double balance;
    protected String accountType;
    String branchCode;

    public BankAccount(double balance, String accountType, String branchCode) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Negative balance not allowed.");
        }
        this.accountType = accountType;
        this.branchCode = branchCode;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal rejected.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
	
	public static void main(String[] args) {

        BankAccount account = new BankAccount(1000, "Savings", "BPL01");

        account.deposit(500);
        account.withdraw(200);
        account.withdraw(1500);

        System.out.println("Final Balance: " + account.getBalance());
    }
}