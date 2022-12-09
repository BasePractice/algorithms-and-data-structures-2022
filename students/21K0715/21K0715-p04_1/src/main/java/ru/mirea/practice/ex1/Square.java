package ru.mirea.practice.ex1;

public class Square extends Shape {
    private final double a;

    Square(double a) {
        this.a = a;
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
