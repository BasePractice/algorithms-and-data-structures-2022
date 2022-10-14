public class Square extends Shape {
    private double x;

    Square() {}

    Square(double x) {
        this.x = x;
    }

    public String getType() {
        return "Rectangle";
    }

    public double getArea() {
        return Math.pow(x,2);
    }

    public double getPerimeter() {
        return x * 4;
    }

    public String toString()  {
        return "Side a = " + x + ", Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}