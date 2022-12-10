package ru.mirea.practice.task1;

public class Circle extends Shape {
    float r = 5.f;

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public float getArea() {
        return r * r * 3.14159f;
    }

    @Override
    public float getPerimeter() {
        return 2 * r * 3.14159f;
    }

    @Override
    public String toString() {
        return getType() + " r=" + r + " area=" + getArea() + " perim=" + getPerimeter();
    }
}
