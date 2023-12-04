package Ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // init list
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

        // create 2 accounts
        BankAccount account1 = new BankAccount("123456789", "John Doe", "1234", 1000);
        BankAccount account2 = new BankAccount("987654321", "Jane Doe", "4321", 500);

        // add accounts to list
        accounts.add(account1);
        accounts.add(account2);

        // ATM simulator
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.println("======================================");
            System.out.println("Welcome to the ATM Simulator!");
            System.out.println("======================================");
            System.out.println("1. Login");
            System.out.println("0. Exit");
            System.out.println("======================================");
            System.out.print("Enter your choice: ");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Enter your card number: ");
                    String cardNumber = scanner.next();
                    System.out.print("Enter your PIN: ");
                    String pin = scanner.next();
                    for(BankAccount account : accounts) {
                        if(account.get_cardNumber().equals(cardNumber) && account.get_pin().equals(pin)) {
                            operation(account);
                            break;
                        }
                    }
                    break;
                case 0:
                    System.out.println("======================================");
                    System.out.println("Thank you for using the ATM Simulator!");
                    System.out.println("======================================");
                    break;
                default:
                    System.out.println("======================================");
                    System.out.println("Invalid choice!");
                    System.out.println("======================================");
                    break;
            }
        } while (input != 0);
    }

    public static void operation(BankAccount account1) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("======================================");
            System.out.println("Welcome, " + account1.get_cardHolder() + "!");
            System.out.println("======================================");
            System.out.println("1. Display Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("0. Logout");
            System.out.println("======================================");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    account1.displayAccount();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double amount = scanner.nextDouble();
                    account1.deposit(amount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextDouble();
                    account1.withdraw(amount);
                    break;
                case 0:
                    System.out.println("======================================");
                    System.out.println("You have logged out!");
                    System.out.println("======================================");
                    break;
                default:
                    System.out.println("======================================");
                    System.out.println("Invalid choice!");
                    System.out.println("======================================");
                    break;
            }
        } while (choice != 0);
    }
}
