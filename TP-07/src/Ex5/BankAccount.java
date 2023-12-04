package Ex5;

public class BankAccount {
    private String _cardNumber;
    private String _cardHolder;
    private String _pin;
    private double _balance;

    public BankAccount() {
    }

    public BankAccount(String cardNumber, String cardHolder, String pin, double balance) {
        _cardNumber = cardNumber;
        _cardHolder = cardHolder;
        _pin = pin;
        _balance = balance;
    }

    public void displayAccount() {
        System.out.println("======================================");
        System.out.println("Card Holder: " + _cardHolder);
        System.out.println("Card Number: " + _cardNumber);
        System.out.println("Balance: " + _balance);
        System.out.println("======================================");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            _balance += amount;
        }else{
            System.out.println("==============================================================================");
            System.out.println("You cannot deposit a negative amount.");
            System.out.println("==============================================================================");
        }
    }

    public void withdraw(double amount) {
        if(_balance - amount < 0) {
            System.out.println("==============================================================================");
            System.out.println("You have insufficient funds to withdraw " + amount + " from your account.");
            System.out.println("==============================================================================");
        }else{
            _balance -= amount;
        }
    }

    public String get_cardNumber() {
        return _cardNumber;
    }

    public String get_pin() {
        return _pin;
    }

    public String get_cardHolder() {
        return _cardHolder;
    }

    public double get_balance() {
        return _balance;
    }
}
