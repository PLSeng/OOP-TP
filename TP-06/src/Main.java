import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercice 1
        Point centre = new Point(8, 8);
        Point point = new Point(10, 8);
        Ex1_Circle c = new Ex1_Circle(centre, point);
        System.out.println("Radius: " + (Math.round(c.radius()*100))/100.0);
        System.out.println("Area: " + (Math.round(c.area()*100))/100.0);
        System.out.println("Circumference: " + (Math.round(c.circumference()*100))/100.0);
    }
}