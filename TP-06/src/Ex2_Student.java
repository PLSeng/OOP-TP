import java.util.ArrayList;
import java.util.Scanner;

public class Ex2_Student {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String ID;
    ArrayList<Ex2_Student> students = new ArrayList<Ex2_Student>();

    public void addStudent(String name, String ID) {
        Ex2_Student student = new Ex2_Student();
        student.name = name;
        student.ID = ID;
        students.add(student);
    }

    public void removeStudentByName(String name) {
        boolean check = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).name.equals(name)) {
                students.remove(i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Student not found");
        }
    }

    public void updateByInfomationByID(String ID) {
        boolean check = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).ID.equals(ID)) {
                System.out.print("Enter new name: ");
                students.get(i).name = scanner.nextLine();
                System.out.print("Enter new ID: ");
                students.get(i).ID = scanner.nextLine();
            }
        }
        if (!check) {
            System.out.println("Student not found");
        }
    }

    public void showAllStudent() {
        if (students.size() == 0) {
            System.out.println("No student");
        } else {
            for (int i = 0; i < students.size(); i++) {
                System.out.println("Name: " + students.get(i).name);
                System.out.println("ID: " + students.get(i).ID);
                System.out.println("--------------------------");
            }
        }
    }
}
