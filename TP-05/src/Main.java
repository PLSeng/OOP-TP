import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to TP5!");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\nPlease choose a program to run:");
            System.out.println("1. Prime Number");
            System.out.println("2. Odd Numbers");
            System.out.println("3. String Mirroring");
            System.out.println("4. Company Profits");
            System.out.println("5. Palindrome");
            System.out.println("6. String Mirroring");
            System.out.println("7. Escape Character Replacement");
            System.out.println("0. Exit");
            System.out.print("\nYour choice: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    new TP5_1_Prime_Number();
                    break;
                case 2:
                    new TP5_2_Odd_Numbers();
                    break;
                case 3:
                    new TP5_3_Even_Numbers();
                    break;
                case 4:
                    new TP5_4_Company_Profits();
                    break;
                case 5:
                    new TP5_5_Palindrome();
                    break;
                case 6:
                    new TP5_6_String_Mirroring();
                    break;
                case 7:
                    new TP5_7_Escape_Character_Replacement();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            if(choice != 0){
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    System.out.println("Error");
                }
            }
        }while(choice != 0);
        scanner.close();
    }
}