package ru.mirea.practice.task3;

public class Circle {
    Point p = new Point(3f, 4f);
    double r;

    public Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "p=" + p +
                ", r=" + r +
                '}';
    }
}
