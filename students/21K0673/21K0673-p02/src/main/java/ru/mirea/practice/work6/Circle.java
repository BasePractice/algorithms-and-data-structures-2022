package ru.mirea.practice.work6;

public class Circle {
    private Point center;
    private double r;

    Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    public Point getCenter() {
        return this.center;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setXY(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    public double getArea() {
        return this.r * this.r * 3.14;
    }

    public double getLength() {
        return this.r * 2 * 3.14;
    }

    public void getComparison(Circle a, Circle b) {
        if (a.getArea() > b.getArea()) {
            System.out.println("Площадь первой окружности больше");
        } else if (a.getArea() == b.getArea()) {
            System.out.println("Площади окружностей равна");
        } else if (a.getArea() < b.getArea()) {
            System.out.println("Площадь второй окружности больше");
        }
        if (a.getLength() > b.getLength()) {
            System.out.println("Длина первой окружности больше");
        } else if (a.getLength() == b.getLength()) {
            System.out.println("Длины окружностей равна");
        } else if (a.getLength() < b.getLength()) {
            System.out.println("Длина второй окружности больше");
        }
    }

    public String toString() {
        return "{" + "Радиус = " + r + ", Координаты центра окружности: " + center + "}";
    }
}
