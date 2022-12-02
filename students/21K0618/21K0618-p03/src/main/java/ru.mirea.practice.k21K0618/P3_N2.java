package ru.mirea.practice.k21K0618;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class P3_N2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        Point p = new Point(random.nextInt(0, 10), random.nextInt(0, 10));

        Circle krug = new Circle(p, (random.nextDouble(1.0, 10.0)));

        Circle shar = new Circle(new Point(666, 667), (random.nextDouble(1, 10)));

        Circle okrug = new Circle(new Point(766, 767), (random.nextDouble(1, 10)));

        Circle sphera = new Circle(new Point(777, 777), (random.nextDouble(1, 10)));

        Circle[] krugi = new Circle[]{krug, shar, okrug, sphera};

        Tester test = new Tester(krugi);

        System.out.println("Координаты точки p: " + p);
        System.out.println("Размер массива Krugi: " + test.getL());
        System.out.println("Массив Krugi: " + test);
        test.sort();
        System.out.println("Отсрортированный Массив Krugi: " + test);
        System.out.println("Max Circle in Krugi: " + test.maxC());
        System.out.println("Min Circle in Krugi: " + test.minC());
    }
}

class Circle {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }


    public Circle() {
    }

    public Circle(Point center, double radius, String colour) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    public double length() {
        return (2.0 * Math.PI * this.radius);
    }

    public double area() {
        return (Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public String toString() {
        return "Круг: " +
                "Центр: " + center +
                ", Радиус r = " + radius;
    }
}

class Point {

    private double x = 0.0;
    private double y = 0.0;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {}

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

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "( " + this.x + ", " + this.y + " )";
    }
}

class Tester {
    private Circle[] C;
    private int l;

    public Tester(Circle[] c) {
        C = c;
        this.l = c.length;
    }

    public Circle[] getC() {
        return C;
    }

    public void setC(Circle[] c) {
        C = c;
    }

    public int getL() {
        return l;
    }

    public Circle minC() {
        if (C.length < 1) { return (new Circle(new Point(0, 0), 0)); }
        else if (C.length == 1) { return C[0]; }
        else {
        Circle circle = C[0];
        for (int i = 1; i < C.length; i++)
        {
            if (C[i].getRadius() < circle.getRadius()) circle = C[i];
        }
        return circle;
        }
    }
    public Circle maxC() {
        if (C.length < 1) { return (new Circle(new Point(0, 0), 0)); }
        else if (C.length == 1) { return C[0]; }
        else {
            Circle circle = C[0];
            for (int i = 1; i < C.length; i++)
            {
                if (C[i].getRadius() > circle.getRadius()) circle = C[i];
            }
            return circle;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(C);
    }

    public void sort() {
        for (int i = 1; i < C.length; i++) {
            double current = C[i].getRadius();
            Circle c = C[i];
            int j = i - 1;
            while(j >= 0 && current < C[j].getRadius()) {
                C[j+1] = C[j];
                j--;
            }
            C[j+1] = c;
        }
    }
}