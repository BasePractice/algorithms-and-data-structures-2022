package ru.mirea.practice.task6;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double plCircle() {
        return PI * pow(r, 2);
    }

    public double dlinCircle() {
        return 2 * PI * r;
    }

    public void sravCirclle(Circle c) {
        if (this.r > c.getR()) {
            System.out.println("1st > 2nd");
        } else if (this.r < c.getR()) {
            System.out.println("1st < 2nd");
        } else {
            System.out.println("1st == 2nd;");
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
