import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Println("Hello, Welcome to Java Programming!");
        Println("This is TP 3");
        Println("Please choose the exercise you want to run: ");
        Println("0. Close");
        Println("1. TP03.1. Seconds to Time");
        Println("2. TP03.2. Time to Seconds");
        Println("3. TP03.3. Calling Costs");
        Println("4. TP03.4. Riel to Dollar");
        Println("5. TP03.5. Travelling Duration");
        Println("6. TP03.6. Float Digit Counter");
        Println("7. TP03.7. Word Finder");

        int choice1;
        Scanner scanner = new Scanner(System.in);
        TD3_1 Ex1 = new TD3_1();
        TD3_2 Ex2 = new TD3_2();


        do {
            Println("=====================================================================");
            Print("Input your choice: ");
            choice1 = scanner.nextInt();
            switch (choice1) {
                case 0:
                    Println("Goodbye!");
                    break;
                case 1:
                    Ex1.run();
                    break;
                case 2:
                    Ex2.run();
                    break;
                case 3:
                    TD3_3.run();
                    break;
                case 4:
                    TD3_4.run();
                    break;
                case 5:
                    TD3_5.run();
                    break;
                case 6:
                    TD3_6.run();
                    break;
                case 7:
                    TD3_7.run();
                    break;
                default:
                    Println("Invalid choice, please try again!");
                    break;
            }
        } while (choice1 != 0);
        Println("=====================================================================");
    }

    public static void Println(String text) {
        System.out.println(text);
    }

    public static void Print(String text) {
        System.out.print(text);
    }
}