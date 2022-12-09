package ru.mirea.practice.task1;

public class Rectangle extends Shape {
    float a = 5, b = 10;
    @Override
    public String getType() {
        return "Rectangle";
    }
    @Override
    public float getArea() {
        return a * b;
    }
    @Override
    public float getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return getType() + " a=" + a + " b=" + b + " area=" + getArea() + " perim=" + getPerimeter();
    }
}
