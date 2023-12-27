package Student_Management;

import java.io.IOException;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        StudentService studentManager = new StudentService();
        int choice = 0;
        while (choice!=3) {
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addStudent(scanner, studentManager);
                    break;
                case 2:
                    System.out.println("+------------+------------+------------+------------+");
                    System.out.println("|    Name    | Birth Date |Phone Number|    City    |");
                    System.out.println("+------------+------------+------------+------------+");
                    studentManager.displayAllStudents();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addStudent(Scanner scanner, StudentService studentManager) throws IOException {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter date of birth: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Enter telephone number: ");
        String telephoneNumber = scanner.nextLine();

        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        //Apply try, catch
        try{
            validateStudentData(name, dateOfBirth, telephoneNumber, city);
            Student student = new Student(name, dateOfBirth, telephoneNumber, city);
            studentManager.addStudent(student);
            System.out.println("Student added successfully!");
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }

    private static void validateStudentData(String name, String dateOfBirth, String telephoneNumber, String city) {
        if (name.isEmpty() || dateOfBirth.isEmpty() || telephoneNumber.isEmpty() || city.isEmpty()) {
            throw new IllegalArgumentException("All fields must be filled in.");
        }

        // Validate date of birth
        if (!isValidDateOfBirth(dateOfBirth)) {
            //if false, throw new exception here
            throw new IllegalArgumentException("Date of birth must be in the format YYYY-MM-DD.");
        }

        // Validate telephone number
        if (!isValidTelephoneNumber(telephoneNumber)) {
            //if false, throw new exception here
            throw new IllegalArgumentException("Telephone number must be a sequence of digits.");
        }
    }

    // Validate date of birth format (YYYY-MM-DD)
    private static boolean isValidDateOfBirth(String dateOfBirth) {
        String datePattern = "\\d{4}-\\d{2}-\\d{2}";
        return dateOfBirth.matches(datePattern);
    }

    // Validate telephone number (only digits allowed)
    private static boolean isValidTelephoneNumber(String telephoneNumber) {
        return telephoneNumber.matches("\\d+");
    }

}
