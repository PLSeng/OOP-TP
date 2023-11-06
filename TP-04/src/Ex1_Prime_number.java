import java.util.Scanner;

public class Ex1_Prime_number {
    public static void run() {
        System.out.print("Input number to check whether it is prime number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int divisor = 2;
        if (n < 2) {
            System.out.println(n + " is not a prime number, because it is less than 2.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    divisor = i;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime number, because it is divisible by " + divisor + ".");
            }
        }
    }
}
