import java.util.Scanner;

public class TP5_6_String_Mirroring {
    public TP5_6_String_Mirroring(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = scanner.nextLine();
        String reverse = new StringBuffer(word).reverse().toString();
        System.out.println(word + reverse);
    }
}
