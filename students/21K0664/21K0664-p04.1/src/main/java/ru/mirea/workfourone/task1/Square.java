package ru.mirea.workfourone.task1;

public class Square extends Shape {
    private double a;

    Square() {
    }

    Square(double a) {
        this.a = a;
    }

    public String getType() {
        return "Rectangle";
    }

    public double getArea() {
        return a * a;
    }

    public double getPerimeter() {
        return a * 4;
    }

    public String toString() {
        return "Rectangle:{Side a = " + a + ", Area = " + (a * a) + ", Perimeter = " + (a * 4) + "}";
    }
}
