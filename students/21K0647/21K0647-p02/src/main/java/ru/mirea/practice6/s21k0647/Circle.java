package ru.mirea.practice6.s21k0647;

public class Circle {
    private double x;
    private double y;
    private double r;
    private String colour;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Circle(double x, double y, double r, String colour) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Circle{" + "x=" + x + ", y=" + y + ", r=" + r + ", colour='" + colour + '\'' + '}';
    }

    public double getLength() {
        double c;
        c = 2 * Math.PI * r;
        return c;
    }

    public double square() {
        double c;
        c = Math.PI * r * r;
        return c;
    }

    public String twoCircle(Circle a) {
        String c1 = "";
        String c2 = "";
        String c3 = "";
        if (this.r > a.r) {
            c1 = "1 Circle > 2 Circle";
        }
        if (this.y > a.y) {
            c2 = "1 Circle higher 2 Circle";
        } else if (this.y < a.y) {
            c2 = "2 Circle higher 1 Circle";
        } else {
            c2 = "at the same height";
        }
        if (this.x > a.x) {
            c3 = "2 Circle to the left 1 Circle";
        } else if (this.x < a.x) {
            c3 = "1 Circle to the left 2 Circle";
        } else {
            c3 = "circles at the same latitude";
        }
        return c1 + "\n" + c2 + "\n" + c3;
    }
}

