public class Ex6_Leap_year {
    public static void run() {
        System.out.println("Program for checking leap year.");
        System.out.print("Please input year: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int year = sc.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
