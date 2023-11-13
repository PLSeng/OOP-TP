import java.util.ArrayList;
import java.util.Scanner;

public class TP5_4_Company_Profits {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Float> _monthlyProfits = new ArrayList<Float>();
    public TP5_4_Company_Profits(){
        float n;
        System.out.println("Please Enter the Profits by month:");
        for (int i = 0; i < 12; i++){
            System.out.print("Profit for month " + (i + 1) + ": ");
            n = scanner.nextFloat();
            _monthlyProfits.add(n);
        }
        float sum = 0;
        for(int i = 0; i < 12; i++){
            sum += _monthlyProfits.get(i);
        }
        System.out.println(String.format("\nTotal Profits for 12 months is %.2f.", sum));
    }
}
