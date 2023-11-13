import java.util.Scanner;

public class TP5_7_Escape_Character_Replacement {
    public TP5_7_Escape_Character_Replacement(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String str = scanner.nextLine();
        str = str.replace("\\n", "(new_line)");
        str = str.replace("\\t", "(tab)");
        str = str.replace("\\", "(slash)");
        str = str.replace("//", "(comment_line)");
        str = str.replace(":)", "(smile)");

        System.out.println("\n" + str);
    }
}
