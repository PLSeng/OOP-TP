
import java.util.Scanner;
public class TD3_5 {
    public static void run() {
        System.out.println("TP03.5. Travelling Duration");
        // Distance = 7km
        // Average Speed = 30km/h
        // Speed Reduce on traffic factor as percentage
        System.out.print("Program for calculating duration of travel from ITC to Airport.\n" +
                "Please input traffic jam factor (in percentage [0-100]): ");
        Scanner scanner = new Scanner(System.in);
        float traffic_factor = scanner.nextFloat();

        float speed = (30f*(1-traffic_factor/100f))/3600;
        float duration = 7/speed;
        TD3_3 Ex3 = new TD3_3();
        String duration_time = Ex3.S2T((int)duration);
        System.out.printf("Travelling Duration = %s", duration_time);
        scanner.close();
    }
}
