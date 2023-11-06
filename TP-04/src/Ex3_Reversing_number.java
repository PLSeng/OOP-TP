import java.util.Scanner;

public class Ex3_Reversing_number {
    public static boolean isValid(int n) {
        return n >= 1000 && n <= 9999;
    }

    public static int reverse(int n) {
        int result = 0;
        while (n > 0) {
            result = result * 10 + n % 10;
            n /= 10;
        }
        return result;
    }

    public static void run() {
        System.out.println("Program for reversing a 4 digits number.");
        System.out.print("Please input 4 digits number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isValid(n)) {
            System.out.println("After reverse: " + reverse(n));
        } else {
            System.out.println("Error: invalid number, please input only 4 digits number.");
        }
    }
}
