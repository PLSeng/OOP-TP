public class Ex1_Circle {
    Point centre;
    Point point;
    Point w1 = new Point(0,1);

    public Ex1_Circle(Point centre, Point point) {
        this.centre = centre;
        this.point = point;
    }



    double radius() {
        return centre.distance(point);
    }

    double area() {
        return Math.PI * Math.pow(radius(), 2);
    }

    double circumference() {
        return 2 * Math.PI * radius();
    }
}
