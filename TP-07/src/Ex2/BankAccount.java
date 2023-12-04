package Ex2;

public class BankAccount {
    private static int totalAccounts = 0;
    String accountHolder;
    double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        totalAccounts++;
    }

    public void displayAccountInfo() {
        System.out.println("======================================");
        System.out.println("Account holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("======================================");
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("======================================");
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
        System.out.println("======================================");

    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("======================================");
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
        System.out.println("======================================");
    }

    public static void displayTotalAccounts() {
        System.out.println("======================================");
        System.out.println("Total accounts: " + totalAccounts);
        System.out.println("======================================");
    }
}
