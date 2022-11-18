package ru.mirea.practice.task3;

public class Circle {
    private Point centre = new Point(0, 0);

    public Circle(double x, double y, double radius) {
        centre.setX(x);
        centre.setY(y);
    }

    public Circle(Point centre) {
        this.centre = centre;
    }

    public Point getCentre() {
        return centre;

    }

    public String toString() {
        return "Circle{ " + "x=" + this.centre.getX() + ", y=" + this.centre.getY() + '}';
    }
}
