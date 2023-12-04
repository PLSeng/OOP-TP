package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SMSList smsList = new SMSList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Send new SMS");
            System.out.println("2. View SMS detail");
            System.out.println("3. List SMSes");
            System.out.println("4. Remove SMSes by index");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine();  // consume newline left-over
                    System.out.print("Enter From phone number: ");
                    String from = scanner.nextLine();
                    System.out.print("Enter Receiver phone number: ");
                    String to = scanner.nextLine();
                    System.out.print("Enter SMS content: ");
                    String content = scanner.nextLine();
                    smsList.addSMS(new SMS(from, to, content));
                    break;
                case 2:
                    System.out.print("Enter SMS index: ");
                    int index = scanner.nextInt();
                    smsList.displaySMS(index);
                    break;
                case 3:
                    smsList.displayAllSMS();
                    break;
                case 4:
                    System.out.print("Enter SMS index: ");
                    int indexToRemove = scanner.nextInt();
                    smsList.removeSMS(indexToRemove);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }
}