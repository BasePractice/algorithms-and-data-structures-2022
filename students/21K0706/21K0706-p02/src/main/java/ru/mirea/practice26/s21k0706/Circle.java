package ru.mirea.practice26.s21k0706;

public class Circle {
    private double x;
    private double y;
    private double r;

    public Circle() {
        //empty constructor
    }

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public  double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public  double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public  double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setDate(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void move(double xdisp, double ydisp, double rdisp) {
        this.x += xdisp;
        this.y += ydisp;
        this.r += rdisp;
    }

    public double area() {
        return Math.PI * Math.pow(r,2);
    }

    public double length() {
        return 2 * Math.PI * r;
    }

    public void compare(Circle a) {
        if (this.r > a.r) {
            System.out.println("\nfirst circle > second circle");
        } else if (this.r < a.r) {
            System.out.println("\nfirst circle < second circle");
        } else {
            System.out.println("\nfirst circle = second circle");
        }
    }

    @Override
    public String toString() {
        return "\nx = " + x + "; y = " + y + "; r = " + r;
    }
}
