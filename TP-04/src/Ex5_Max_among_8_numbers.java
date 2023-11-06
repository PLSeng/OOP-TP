public class Ex5_Max_among_8_numbers {
    public static void run(){
        System.out.println("Program for finding max among 8 numbers.");
        System.out.print("Please input 8 numbers: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println();
        int max = sc.nextInt();
        for (int i = 1; i < 8; i++) {
            int n = sc.nextInt();
            if (n > max) {
                max = n;
            }
        }
        System.out.println("Max number is " + max);
    }
}
