package Example;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fileReader = new FileReader("hello.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("Finished .....");

        try {
            FileWriter fileWriter = new FileWriter("hello.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Siemreap is a beautiful city.");
            bufferedWriter.newLine();
            bufferedWriter.write("Takeo is an old province.");
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}

