package ru.mirea.practice.s21k0647.zad8;

public class Circle extends Shape {

    final double pi = Math.PI;
    protected double radius;

    Circle() {
        //pus
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        String s = String.format("%.2f", pi * radius * radius);
        s = s.replace(",", ".");
        return Double.parseDouble(s);
    }

    @Override
    public double getPerimeter() {
        String s = String.format("%.2f", 2 * pi * radius);
        s = s.replace(",", ".");
        return Double.parseDouble(s);
    }

    @Override
    public String toString() {
        String s = "Полая";
        if (filled) {
            s = "Закрашенная";
        }
        return "Окружность с радиусом " + radius + "\nЦвет:" + color + " " + s + "\nПлощадь: " + this.getArea() + "\nПериметр:" + this.getPerimeter();

    }



}
