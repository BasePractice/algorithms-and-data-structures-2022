package ru.mirea.practice.s21k0647.zad1;

public class Rectangle extends Shape {
    double a;
    double b;

    Rectangle(String type, double a, double b) {
        super(type);
        this.a = a;
        this.b = b;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public String getAria() {
        return String.valueOf(a * b);
    }

    @Override
    public String getPerimeter() {
        return String.valueOf(2 * (a + b));
    }

    @Override
    public String toString() {
        return getType() + " a = " + this.a + " b = " + this.b + " Aria: " + getAria() + " Perimeter: " + getPerimeter();
    }


}
