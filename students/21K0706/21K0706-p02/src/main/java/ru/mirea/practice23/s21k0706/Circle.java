package ru.mirea.practice23.s21k0706;

public class Circle {
    private Point a1;                                                                 //= new Point(double x, double y);
    private double r;

    public Circle(double a, double b, double r) {
        this.a1 = new Point(a, b);
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle: " + a1.toString() + " radius = " + r;
    }

}
