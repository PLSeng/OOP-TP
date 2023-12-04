package Ex4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.displayShape();

        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.displayShape();

        Triangle triangle = new Triangle(5, 10, 5, 5);
        triangle.displayShape();
    }
}
