import java.util.Scanner;

public class TD3_6 {
    public static void run() {
        System.out.println("TP03.6. Float Digit Counter");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a floating-point number: ");
        float number = scanner.nextFloat();
        float number1 = number;

        int digit_int = 0;
        while (number >= 1) {
            number /= 10;
            digit_int++;
        }

        int digit_frac = String.valueOf(number1).length() - digit_int - 1;

        scanner.close();

        System.out.printf("Number of digits in integer part = %d\n", digit_int);
        System.out.printf("Number of digits in fractional part = %d\n", digit_frac);
    }
}
