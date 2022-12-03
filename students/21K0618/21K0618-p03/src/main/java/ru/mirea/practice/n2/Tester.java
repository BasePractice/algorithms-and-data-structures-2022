package ru.mirea.practice.n2;

import java.util.Arrays;

class Tester {
    private Circle[] c;
    private int l;

    public Tester(Circle[] c) {
        this.c = c;
        this.l = c.length;
    }

    public Circle[] getC() {
        return c;
    }

    public void setC(Circle[] c) {
        this.c = c;
    }

    public int getL() {
        return l;
    }

    public Circle minC() {
        if (c.length < 1) {
            return new Circle(new Point(0, 0), 0);
        } else if (c.length == 1) {
            return c[0];
        } else {
            Circle circle = c[0];
            for (int i = 1; i < c.length; i++) {
                if (c[i].getRadius() < circle.getRadius()) {
                    circle = c[i];
                }
            }
            return circle;
        }
    }

    public Circle maxC() {
        if (c.length < 1) {
            return new Circle(new Point(0, 0), 0);
        } else if (c.length == 1) {
            return c[0];
        } else {
            Circle circle = c[0];
            for (int i = 1; i < c.length; i++) {
                if (c[i].getRadius() > circle.getRadius()) {
                    circle = c[i];
                }
            }
            return circle;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(c);
    }

    public void sort() {
        for (int i = 1; i < c.length; i++) {
            double current = c[i].getRadius();
            Circle c = this.c[i];
            int j = i - 1;
            while (j >= 0 && current < this.c[j].getRadius()) {
                this.c[j + 1] = this.c[j];
                j--;
            }
            this.c[j + 1] = c;
        }
    }
}
