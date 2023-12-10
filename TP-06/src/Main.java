import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Welcome to Assignment 5");
            System.out.println("Which exercise do you want to run?");

            System.out.println("1. Exercise 1");
            System.out.println("2. Exercise 2");
            System.out.println("3. Exercise 3");
            System.out.println("4. Exercise 4");
            System.out.println("5. Exercise 5");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("--------------------------");
                    System.out.println("Exercise 1");
                    System.out.println("--------------------------");
                    new Exercise1();
                    break;
                case 2:
                    System.out.println("--------------------------");
                    System.out.println("Exercise 2");
                    System.out.println("--------------------------");
                    new Exercise2();
                    break;
                case 3:
                    System.out.println("--------------------------");
                    System.out.println("Exercise 3");
                    System.out.println("--------------------------");
                    new Exercise3();
                    break;
                case 4:
                    System.out.println("--------------------------");
                    System.out.println("Exercise 4");
                    System.out.println("--------------------------");
                    new Exercise4();
                    break;
                case 5:
                    System.out.println("--------------------------");
                    System.out.println("Exercise 5");
                    System.out.println("--------------------------");
                    new Exercise5();
                    break;
                case 0:
                    System.out.println("Goodbye");
                    System.exit(0);
                default:
                    System.out.println("--------------------------");
                    System.out.println("Invalid choice");
                    System.out.println("--------------------------");
                    break;
            }
        }while (choice != 0);
    }
}