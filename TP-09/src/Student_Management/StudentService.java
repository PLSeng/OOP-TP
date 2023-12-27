package Student_Management;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students;
    private static final String FILE_PATH = "src/Student_Management/studentList.txt";

    public StudentService() throws IOException {
        this.students = new ArrayList<>();
        getStudentsFromFile();
    }

    // Load student data from file
    private void getStudentsFromFile() throws IOException {
        //apply try catch
        BufferedReader ois = new BufferedReader(new FileReader(FILE_PATH));
        String line;
        while((line=ois.readLine())!=null) {
            String[] words = line.split("\\|");
            //add each word into student list
            students.add(new Student(words[0], words[1], words[2], words[3]));
        }
    }

    // Save student data to file
    private void saveStudentsToFile() throws IOException {
        //apply try catch
        try{
            BufferedWriter oos = new BufferedWriter(new FileWriter(FILE_PATH));
            for (Student student : students) {
                oos.write(student.toString());
                oos.newLine();
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }

    // Add a new student
    public void addStudent(Student student) throws IOException {
        students.add(student);
        saveStudentsToFile();
    }

    // Display all students
    public void displayAllStudents() {
        for (Student student : students) {
            System.out.printf("| %10s | %10s | %10s | %10s |\n", student.getName(), student.getDateOfBirth(), student.getTelephoneNumber(), student.getCity());
        }
    }
}

