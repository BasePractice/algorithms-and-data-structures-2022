package ru.mirea.worktwo.task6;

public class Circle {
    private static final double pi = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double square() {
        return pi * this.radius * this.radius;
    }

    public double length() {
        return 2 * pi * this.radius;
    }

    public void compare(Circle a) {
        if (this.square() == a.square() && this.radius == a.radius && this.length() == a.length()) {
            System.out.println("Окружности равны");
        } else {
            System.out.println("Окружности не равны");
        }
    }
}
