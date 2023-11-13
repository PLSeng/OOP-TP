import java.util.ArrayList;

public class TP5_2_Odd_Numbers {
    private ArrayList<Integer> _oddNumbers = new ArrayList<Integer>();
    public TP5_2_Odd_Numbers(){
        System.out.println("Odd numbers from 1 to 500:");
        for(int i = 1; i <= 500; i++){
            if(i % 2 != 0){
                _oddNumbers.add(i);
            }
        }
        for(int i = 0; i < _oddNumbers.size(); i++){
            if(i == _oddNumbers.size() - 1){
                System.out.print(_oddNumbers.get(i));
            } else {
                System.out.print(_oddNumbers.get(i) + ", ");
            }
            if (i % 10 == 0 && i != 0){
                System.out.println();
            }
        }
        System.out.println("\n");
    }
}
