package ru.mirea.practice.task1;

public abstract class Shape {
    abstract String getType();

    abstract double getArea();

    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Figure: " + getType() + ", S = " + getArea() + ", P = " + getPerimeter();
    }


}
