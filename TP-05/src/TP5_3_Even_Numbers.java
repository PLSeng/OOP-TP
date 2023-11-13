import java.util.ArrayList;
import java.util.Scanner;

public class TP5_3_Even_Numbers {
    private ArrayList<Integer> _evenNumbers = new ArrayList<Integer>();
    public TP5_3_Even_Numbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 499: ");
        int n = scanner.nextInt();
        System.out.println("Even numbers from 1 to 500:");
        if(n > 0 && n < 500){
            for(int i = 1; i <= n; i++){
                if(i % 2 == 0){
                    _evenNumbers.add(i);
                }
            }
            for(int i = 0; i < _evenNumbers.size(); i++){
                if(i == _evenNumbers.size() - 1){
                    System.out.print(_evenNumbers.get(i));
                } else {
                    System.out.print(_evenNumbers.get(i) + ", ");
                }
                if (i % 10 == 0 && i != 0){
                    System.out.println();
                }
            }
            System.out.println("\n");
        }else{
            System.out.println("Invalid input. The Input must be between 1 and 499.");
        }
    }
}
