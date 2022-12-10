package ru.mirea.practice.task1;

public abstract class Shape {
    protected String color;

    public Shape(String color){
        this.color = color;
    }

    public abstract String getType();
    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public abstract String toString();
}
