package ru.mirea.practice.task8;

import ru.mirea.practice.task1.Shape;

public class Square extends Shape {
    private double x;

    Square() {}

    Square(double x) {
        this.x = x;
    }

    public String getType() {
        return "ru.mirea.practice.task8.Rectangle";
    }

    public double getArea() {
        return Math.pow(x,2);
    }

    public double getPerimeter() {
        return x * 4;
    }

    public String toString()  {
        return "Side a = " + x + ", Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}