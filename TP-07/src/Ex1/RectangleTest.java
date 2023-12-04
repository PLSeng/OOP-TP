package Ex1;

public class RectangleTest {
    public static void main(String[] args) {
        // 1. Create an instance of class Rectangle
        Rectangle rectangle = new Rectangle(5, 10);

        // 2. Display perimeter of it
        System.out.println("The perimeter of the rectangle is: " + rectangle.calculatePerimeter());

        // 3. Display surface of it
        System.out.println("The surface of the rectangle is: " + rectangle.calculateSurface());
    }
}