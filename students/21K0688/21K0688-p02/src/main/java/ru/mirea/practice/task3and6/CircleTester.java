package ru.mirea.practice.task3and6;

import java.util.Scanner;

public class CircleTester {
    private static final int N = 3;

    public int getN() {
        return N;
    }

    public static void main(String[] args) {
        Circle[] arr = new Circle[N];
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < N; i++) {
                double radius;
                System.out.print("Radius = ");
                radius = sc.nextDouble();
                System.out.print("X = ");
                int x;
                x = sc.nextInt();
                System.out.print("Y = ");
                double y;
                y = sc.nextDouble();
                Circle circle = new Circle(radius, x, y);
                arr[i] = circle;
                double area = arr[i].area();
                double length = arr[i].length();
                System.out.println("area = " + area);
                System.out.println("length " + length);
            }
            Circle first = new Circle();
            Circle second = new Circle();
            first.setRadius(10);
            second.setRadius(15);

            Circle.comparison(first, second);
        }
    }
}
