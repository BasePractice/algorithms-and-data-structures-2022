package ru.mirea.practice.task1;

public class Square extends Rectangle {
    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public float getArea() {
        return a * a;
    }

    @Override
    public float getPerimeter() {
        return 4 * a;
    }

    @Override
    public String toString() {
        return getType() + " a=" + a + " area=" + getArea() + " perim=" + getPerimeter();
    }
}
