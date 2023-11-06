import java.util.Scanner;

public class Ex4_Money_Exchanges {
    public static void run() {
        System.out.println("Welcome to program Money Exchanges!");
        System.out.println("\t1. Riels to Dollar");
        System.out.println("\t2. Riels to Thai Baht");
        System.out.println("\t3. Dollar to Riels");
        System.out.println("\t4. Dollar to Thai Baht");
        System.out.println("\t5. Thai Baht to Riels");
        System.out.println("\t6. Exit");
        int choice;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    rielsToDollar();
                    break;
                case 2:
                    rielsToThaiBaht();
                    break;
                case 3:
                    dollarToRiels();
                    break;
                case 4:
                    dollarToThaiBaht();
                    break;
                case 5:
                    thaiBahtToRiels();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, please choose again.");
            }
        }while (!isChoiceValid(choice));
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 6;
    }

    public static void rielsToDollar() {
        System.out.print("Input amount of Riels: ");
        Scanner scanner = new Scanner(System.in);
        float riels = scanner.nextFloat();
        System.out.printf("%.2f Riels = %.2f Dollars\n", riels, riels / 4000);
    }

    public static void rielsToThaiBaht() {
        System.out.print("Input amount of Riels: ");
        Scanner scanner = new Scanner(System.in);
        float riels = scanner.nextFloat();
        System.out.printf("%.2f Riels = %.2f Thai Baht\n", riels, riels / 120);
    }

    public static void dollarToRiels() {
        System.out.print("Input amount of Dollars: ");
        Scanner scanner = new Scanner(System.in);
        float dollars = scanner.nextFloat();
        System.out.printf("%.2f Dollars = %.2f Riels\n", dollars, dollars * 4000);
    }

    public static void dollarToThaiBaht() {
        System.out.print("Input amount of Dollars: ");
        Scanner scanner = new Scanner(System.in);
        float dollars = scanner.nextFloat();
        System.out.printf("%.2f Dollars = %.2f Thai Baht\n", dollars, dollars * 30);
    }

    public static void thaiBahtToRiels() {
        System.out.print("Input amount of Thai Baht: ");
        Scanner scanner = new Scanner(System.in);
        float thaiBaht = scanner.nextFloat();
        System.out.printf("%.2f Thai Baht = %.2f Riels\n", thaiBaht, thaiBaht * 120);
    }

}