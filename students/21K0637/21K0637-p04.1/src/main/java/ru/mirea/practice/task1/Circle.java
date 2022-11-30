package ru.mirea.practice.task1;

public class Circle extends Shape {
    private final double radius;

    public Circle(final double radius) {
        this.radius = radius;
    }

    @Override
    public final String getType() {
        return "Circle";
    }

    @Override
    public final double getArea() {
        return pi * radius * radius;
    }

    @Override
    public final double getPerimeter() {
        return 2 * pi * radius;
    }

    @Override
    public final String toString() {
        return "{Type=" + getType()
            + "; radius=" + radius
            + "; Area=" + getArea()
            + "; Perimeter=" + getPerimeter()
            + '}';
    }
}
