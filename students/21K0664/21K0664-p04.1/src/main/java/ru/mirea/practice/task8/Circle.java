package ru.mirea.practice.task8;

import ru.mirea.practice.task1.Shape;

public class Circle extends Shape {
    private double r;

    Circle() {}

    Circle(double r) {
        this.r = r;
    }

    public String getType() {
        return "ru.mirea.practice.task8.Circle";
    }

    public double getArea() {
        return 3.14 * r * r;
    }

    public double getPerimeter() {
        return 2 * 3.14 * r;
    }

    public String toString()  {
        return "Radius = " + r + ", Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}