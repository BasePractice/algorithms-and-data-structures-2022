package ru.mirea.practice.task2;

public class Circle {
    Circle() {
        centre = new Point(0, 0);
    }

    Circle(Point pos, float r) {
        centre = pos;
        this.r = r;
    }

    Circle(double x, double y) {
        centre = new Point(x, y);
    }

    Circle(double x, double y, float r) {
        centre = new Point(x, y);
        this.r = r;
    }

    public void setCentre(Point pos) {
        centre = pos;
    }

    public boolean largerThan(Circle other) {
        return this.r > other.r;
    }

    public boolean smallerThan(Circle other) {
        return this.r < other.r;
    }

    @Override public String toString() {
        return "Circle(" + centre + ", " + r + ")";
    }

    Point centre;
    float r = 10;
}
