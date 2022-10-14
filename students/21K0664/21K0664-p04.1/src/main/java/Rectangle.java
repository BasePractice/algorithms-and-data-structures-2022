public class Rectangle extends Shape {
    private double x;
    private double y;

    Rectangle() {
    }

    Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getType() {
        return "Rectangle";
    }

    public double getArea() {
        return x * y;
    }

    public double getPerimeter() {
        return 2 * x + 2 * y;
    }

    public String toString() {
        return "Rectangle:{Side a = " + x + "Side b = " + y + ", Area = " + (x * y) + ", Perimeter = " + (2 * x + 2 * y) + "}";
    }
}