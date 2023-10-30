import java.util.Scanner;

public class TD3_1 {
    public void run() {
        System.out.println("TP03.1. Seconds to Time");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Implement an application Java that take a given number of seconds for converting into time with format \n" +
                "Hours:Minutes:Seconds");
        System.out.print("Input the number of seconds: ");
        int second = scanner.nextInt();
        System.out.printf("Time corresponding to %d seconds is %d:%d:%d.", second, (second/3600), ((second%3600)/60), (second%60));
    }
}
