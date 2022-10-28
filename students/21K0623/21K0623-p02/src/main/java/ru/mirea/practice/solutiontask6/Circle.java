package ru.mirea.practice.solutiontask6;

public class Circle {
    private double radius;
    private double x;
    private double y;

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public Circle() {
        this.radius = 0.0;
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getR() {
        return this.radius;
    }

    public void setR(double radius) {
        this.radius = radius;
    }

    public void setCenter(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getLength() {
        return 2 * Math.PI * this.radius;
    }

    public boolean biggest(Circle temp) {
        return temp.radius < this.radius;
    }

    public boolean equal(Circle temp) {
        return temp.radius == this.radius;
    }

    @Override
    public String toString() {
        return "Окружность с радиусом " + this.radius + " и центром (" + this.x + "," + this.y + ")";
    }
}

