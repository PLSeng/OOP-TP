import java.util.Scanner;

public class TD3_3 {
    public static void run() {
        System.out.println("TP03.3. Calling Cost");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Input Start Hours: ");
        int start_hour = scanner.nextInt();
        System.out.print("Please Input Start Minutes: ");
        int start_minute = scanner.nextInt();
        System.out.print("Please Input Start Seconds: ");
        int start_second = scanner.nextInt();

        System.out.println("\n");

        System.out.print("Please Input End Hours: ");
        int end_hour = scanner.nextInt();
        System.out.print("Please Input End Minutes: ");
        int end_minute = scanner.nextInt();
        System.out.print("Please Input End Seconds: ");
        int end_second = scanner.nextInt();
        System.out.println("\n\n");
        scanner.close();

        int start_time = T2S(start_hour, start_minute, start_second);
        int end_time = T2S(end_hour, end_minute, end_second);
        int duration = end_time - start_time;
        float duration_minute = duration/60f;
        // The cost is 0.05$ per minute
        float cost = duration_minute*0.05f;
        System.out.printf("Total call duration: %s", S2T(duration));
        System.out.printf("\nTotal cost of this call: %.3f$", cost);
    }

    private static int T2S(int hour, int minute, int second) {
        return hour*3600+minute*60+second;
    }

    public static String S2T(int second) {
        return String.format("%d:%d:%d", (second/3600), ((second%3600)/60), (second%60));
    }
}
