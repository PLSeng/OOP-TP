import java.util.Scanner;

public class Ex2_Lucky_number {
    public static boolean isValid(int n) {
        return n >= 100000 && n <= 999999;
    }

    public static boolean isLucky(int n) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += n % 10;
            n /= 10;
        }
        for (int i = 0; i < 3; i++) {
            sum2 += n % 10;
            n /= 10;
        }
        return sum1 == sum2;
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for testing for lucky number.");
        System.out.print("Please input 6 digits number: ");
        int n = sc.nextInt();
        if (isValid(n)) {
            if (isLucky(n)) {
                System.out.println(n + " is a lucky number.");
            } else {
                System.out.println(n + " is not a lucky number.");
            }
        } else {
            System.out.println("Invalid input number, please input only 6 digits number.");
        }
    }
}
