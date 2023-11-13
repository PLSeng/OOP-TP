import java.util.Scanner;

public class Ex1_Prime_number {
    private int _n = 2, _divisor = 1;

    public Ex1_Prime_number() {
        System.out.print("Input number to check whether it is prime number: ");
        Scanner sc = new Scanner(System.in);
        this._n = sc.nextInt();
        new Ex1_Prime_number(this._n);
    }

    public Ex1_Prime_number(int n) {
        if (n < 2) {
            System.out.println(n + " is not a prime number, because it is less than 2.");
        } else {
            if (isPrime(n)) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime number, because it is divisible by " + this._divisor + ".");
            }
        }
    }

    public boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                this._divisor = i;
                return false;
            }
        }
        return true;
    }
}
