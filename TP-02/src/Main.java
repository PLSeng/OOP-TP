import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================================================");
        System.out.println("Student Name: PAV Limseng");
        System.out.println("Student ID: e20211548");
        System.out.println("Class: I3-AMS-TP-B");
        System.out.println("==================================================================");
        System.out.print("Please input your favourite subject: ");
        String subject = scanner.nextLine();
        System.out.println("Your favourite subject is " + subject);
        System.out.println("==================================================================");
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.println("The result is " + (number2 + number1));

        System.out.println("==================================================================");
        System.out.println("TP02.1 Hello One's Name");
        System.out.print("Input your name: ");
        scanner.nextLine();
        String name1 = scanner.nextLine();
        System.out.println("Hello " + name1 + "!");

        System.out.println("==================================================================");
        System.out.println("TP02.2 Rectangle");
        System.out.println("Program for calculating perimeter and surface of a Rectangle.");
        System.out.print("Please input width (in meter): ");
        int width = scanner.nextInt();
        System.out.print("Please input height (in meter): ");
        int height = scanner.nextInt();
        System.out.println("Perimeter = (" + width + " + " + height + ") * 2 = " + ((width + height) * 2) + " m");
        System.out.println("Surface = (" + width + " * " + height + ") = " + (width * height) + " m^2");

        System.out.println("==================================================================");
        System.out.println("TP02.3 Equation");
        System.out.println("1/x = 1/y + 1/z");
        System.out.print("Input y: ");
        double y = scanner.nextDouble();
        System.out.print("Input z: ");
        double z = scanner.nextDouble();
        System.out.println("1/x = 1/" + y + " + 1/" + z + " = " + ((z + y) / (z * y)));
        System.out.println("=> x = " + ((z * y) / (z + y)));

        System.out.println("==================================================================");
        System.out.println("TP02.4 Hundred's Counter");
        System.out.print("Program for counting the number of hundreds.\n" +
                "Please input a positive number: ");
        int number3 = scanner.nextInt();
        System.out.println("There are " + number3 / 100 + " hundred in number " + number3 + '.');

        System.out.println("==================================================================");
        System.out.println("TP02.5 Cheater Game");
        System.out.print("Program for guessing your luckiness.\n" +
                "Please input a positive number: ");
        int number4 = scanner.nextInt();
        System.out.println("I got " + (number4 + 1) + ". I am luckier.");

        System.out.println("==================================================================");
        System.out.println("TP02.6 Summation without Loop");
        for (int i = 0; i < 3; i++) {
            System.out.print("Input the start number: ");
            int start_number = scanner.nextInt();
            System.out.print("Input the end number: ");
            int end_number = scanner.nextInt();
            System.out.print("Input the increment: ");
            int increment = scanner.nextInt();
            int n = (end_number - start_number) / increment + 1;
            double sum = (double) n / 2 * (2 * start_number + (n - 1) * increment);
            System.out.println("The sum is: " + sum);
            System.out.print("\n");
        }
        System.out.println("==================================================================");
    }
}