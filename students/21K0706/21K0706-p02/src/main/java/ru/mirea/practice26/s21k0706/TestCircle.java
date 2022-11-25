package ru.mirea.practice26.s21k0706;

import java.util.Scanner;

public final class TestCircle {
    private TestCircle() {

    }

    public static void main(String[] args) {
        Circle c1 = new Circle(1,3, 5);
        System.out.println("\nArea: " + c1.area() + "; Circumference length: " + c1.length());
        Circle c2 = new Circle(5,8, 10.2);
        System.out.println(c2.toString());
        try (Scanner in = new Scanner(System.in)) {
            Circle c3 = new Circle();
            System.out.println("\nEnter the x, y, radius: ");
            c3.setDate(in.nextDouble(), in.nextDouble(), in.nextDouble());
            System.out.println("Area: " + c3.area() + "; Circumference length: " + c3.length());
            Circle c4 = new Circle();
            System.out.println("\nEnter the x, y, radius: ");
            c4.setDate(in.nextDouble(), in.nextDouble(), in.nextDouble());
            System.out.println("Area: " + c4.area() + "; Circumference length: " + c4.length());
            c3.compare(c4);
        }
    }
}
