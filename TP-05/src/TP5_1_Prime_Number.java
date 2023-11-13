import java.util.ArrayList;
import java.util.Scanner;

public class TP5_1_Prime_Number {
    private ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
    public TP5_1_Prime_Number(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number to list prime numbers from 2 to it: ");
        int n = scanner.nextInt();
        for(int i = 2; i <= n; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primeNumbers.add(i);
            }
        }
        if(primeNumbers.isEmpty()){
            System.out.println("No prime numbers found.");
        } else {
            for (int i = 0; i < primeNumbers.size(); i++) {
                if (i == primeNumbers.size() - 1) {
                    System.out.print(primeNumbers.get(i));
                } else {
                    System.out.print(primeNumbers.get(i) + ", ");
                }
            }
            if (primeNumbers.size() == 1) {
                System.out.print(" is the prime number.");
            } else {
                System.out.println(" are the prime numbers.");
            }
            System.out.println("\n");
        }
    }
}
