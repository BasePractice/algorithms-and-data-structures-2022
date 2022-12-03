package ru.mirea.practice;

import java.util.Arrays;
import java.util.Scanner;

class CircleTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 3 или 6 какую программу хотите оценить на работоспособность");
        int vibor = scan.nextInt();
        if (vibor == 3) {
            Point p = new Point(4, 4);

            Circle krug = new Circle(p, 10);

            Circle shar = new Circle(new Point(666, 667), 676);

            Circle okrug = new Circle(new Point(766, 767), 776);

            Circle sphera = new Circle(new Point(777, 777), 777);

            Circle[] krugi = new Circle[]{krug, shar, okrug, sphera};

            Tester_3_6 test = new Tester_3_6(krugi);
            System.out.println("Координаты точки p: " + p);
            System.out.println("Размер массива Krugi: " + test.getL());
            System.out.println("Массив Krugi: " + test);
        }
        else if (vibor == 6)
        {
            Point p = new Point(4, 4);

            Circle krug = new Circle(p, 10, "Синий");

            Circle shar = new Circle(new Point(666, 667), 676, "Белый");

            Circle ellips = new Circle(shar.getCenter(), krug.getRadius(), krug.getColour());

            System.out.println(krug + ", Длина: " + krug.length() + ", Площадь: " + krug.area());
            System.out.println(krug.equals(shar));
            System.out.println(krug.equals(ellips));





        }

    }
}

class Tester_3_6 {
    private Circle[] C;
    private int l;

    public Tester_3_6(Circle[] c) {
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

    @Override
    public String toString() {
        return Arrays.toString(C);
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

class Circle {

    private Point center;
    private double radius;
    private String colour;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }


    public Circle() {
    }

    public Circle(Point center, double radius, String colour) {
        this.center = center;
        this.radius = radius;
        this.colour = colour;
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

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean equals (Circle c) {
        if (c.colour.equals(colour) && c.radius == radius) return true;
        else return false;
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
                ", Радиус r = " + radius +
                ", Цвет: '" + colour + '\'';
    }
}