package Ex2;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", 1000);
        BankAccount account2 = new BankAccount("Jane Doe", 2000);

        account1.displayAccountInfo();
        account1.deposit(500);
        account1.withdraw(200);

        account2.displayAccountInfo();
        account2.deposit(1000);
        account2.withdraw(500);

        BankAccount.displayTotalAccounts();
    }
}
