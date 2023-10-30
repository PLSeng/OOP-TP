import java.util.Scanner;

public class TD3_2 {
    public void run(){
        System.out.println("TP03.2. Time to Seconds");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Input Hours: ");
        int hour = scanner.nextInt();
        System.out.print("Please Input Minutes: ");
        int minute = scanner.nextInt();
        System.out.print("Please Input Seconds: ");
        int second = scanner.nextInt();
        System.out.print("\n\n");
        System.out.printf("Number of seconds = %d x 3600 + %d x 60 + %d = %d", hour, minute, second, (hour*3600+minute*60+second));
        scanner.close();
    }
}
