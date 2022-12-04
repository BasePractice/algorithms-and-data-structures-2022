package ru.mirea.practice.s.task6;

public class Circle {
    static final double PI = 3.14;
    private int radius;
    private int xcenter;
    private int ycenter;

    public Circle(int radius, int xcenter, int ycenter) {
        this.radius = radius;
        this.xcenter = xcenter;
        this.ycenter = ycenter;
    }

    public int getRadius() {
        return radius;
    }

    public void getCenter() {
        System.out.printf("{%d; %d}", xcenter, ycenter);
    }

    public double getSquare() {
        return PI * radius * radius;
    }

    public double getLength() {
        return 2 * PI * radius;
    }

    public int compareTo(Circle circle) {
        if (this.getSquare() > circle.getSquare()) {
            return 1;
        } else if (this.getSquare() == circle.getSquare()) {
            return 0;
        }
        return -1;
    }
}
