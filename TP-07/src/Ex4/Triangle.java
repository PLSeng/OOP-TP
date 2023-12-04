package Ex4;

public class Triangle extends Shape {
    double base;
    double height;
    double side1;
    double side2;

    public Triangle(double base, double height, double side1, double side2) {
        super("Triangle");
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

    public double calculatePerimeter() {
        return base + side1 + side2;
    }
}
