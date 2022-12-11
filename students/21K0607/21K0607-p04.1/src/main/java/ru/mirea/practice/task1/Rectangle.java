package ru.mirea.practice.task1;

public class Rectangle extends Shape {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public double getPerimeter() {
        return 2 * secondSide + 2 * firstSide;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "firstSide=" + firstSide + ", secondSide=" + secondSide + '}';
    }
}
