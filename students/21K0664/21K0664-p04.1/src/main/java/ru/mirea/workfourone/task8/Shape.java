package ru.mirea.workfourone.task8;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    Shape() {
    }

    Shape(String color, boolean filled) {
    }

    public abstract String getColor();

    public abstract void setColor(String color);

    public abstract boolean isFilled();

    public abstract void setFilled(boolean filled);

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();
}
