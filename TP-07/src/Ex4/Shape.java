package Ex4;

public abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void displayShape() {
        System.out.println("======================================");
        System.out.println("Name: " + name);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("======================================");
    }
}
