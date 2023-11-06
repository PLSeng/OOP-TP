import java.util.Scanner;

public class Ex1_Prime_number {
    private int _n = 2, _divisor = 1;
    public Ex1_Prime_number(){
        System.out.print("Input number to check whether it is prime number: ");
        Scanner sc = new Scanner(System.in);
        this._n = sc.nextInt();
        Ex1_Prime_number newEx1 = new Ex1_Prime_number(this._n);
    }

    public Ex1_Prime_number(int n){
        if (n < 2) {
            System.out.println(n + " is not a prime number, because it is less than 2.");
        }else {
            if(isPrime(n)){
                System.out.println(n + " is a prime number");
            } else {
                divisor(n);
                System.out.println(n + " is not a prime number, because it is divisible by " + this._divisor + ".");
            }
        }
    }

    public static boolean isPrime(int n){
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void divisor(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                this._divisor = i;
            }
        }
    }
}
