public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to TP-04.");
        int choice = 1;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        do {
            System.out.println("==================================================");
            System.out.println("Please choose the exercise you want to run: ");
            System.out.println("\t0. Exit.");
            System.out.println("\t1. Prime number.");
            System.out.println("\t2. Lucky number.");
            System.out.println("\t3. Reversing number.");
            System.out.println("\t4. Money Exchanges.");
            System.out.println("\t5. Max among 8 numbers.");
            System.out.println("\t6. Leap year.\n\n");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 0:
                    System.out.println("Goodbye!");
                    break;
                case 1:
                    Ex1_Prime_number.run();
                    break;
                case 2:
                    Ex2_Lucky_number.run();
                    break;
                case 3:
                    Ex3_Reversing_number.run();
                    break;
                case 4:
                    Ex4_Money_Exchanges.run();
                    break;
                case 5:
                    Ex5_Max_among_8_numbers.run();
                    break;
                case 6:
                    Ex6_Leap_year.run();
                    break;
                default:
                    System.out.println("Invalid choice, please choose again.");
            }
            try {
                Thread.sleep(2500);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

        }while (choice != 0);
        System.out.println("==================================================");
    }
}