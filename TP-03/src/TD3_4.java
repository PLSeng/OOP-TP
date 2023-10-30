import java.util.Scanner;

public class TD3_4 {
    public static void run() {
        System.out.println("TP03.4. Riel to Dollar");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversion rate is: 1$ = 4000 Riels");
        System.out.print("Please Input the number in Riel: ");
        int riel = scanner.nextInt();
        scanner.close();
        System.out.printf("\n%d Riels = %.2f USD", riel, (riel/4000f));
    }
}
