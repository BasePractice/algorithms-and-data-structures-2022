package ru.mirea.workfourone.task1;

public class Square extends Shape {
    double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getType() {
        return "square";
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public String toString() {
        return "task1.Square{" + "a=" + a + ", type: " + getType() + ", perimeter: " + getPerimeter() + ", area: " + getArea() + '}';
    }
}
