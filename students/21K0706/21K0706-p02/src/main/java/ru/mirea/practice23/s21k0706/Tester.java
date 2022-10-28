package ru.mirea.practice23.s21k0706;

import java.util.Scanner;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the number of array elements: ");
            int n = in.nextInt();
            Circle[] circles = new Circle[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter x: ");
                double a = in.nextDouble();
                System.out.println("Enter y: ");
                double b = in.nextDouble();
                System.out.println("Enter radius: ");
                double r = in.nextDouble();
                circles[i] = new Circle(a, b, r);
            }
            for (int i = 0; i < n; i++) {
                System.out.println(circles[i].toString());
            }
            /*Circle[] circles = new Circle[3];
            circles[0] = new Circle(1,2,2);
            circles[1] = new Circle(3,5,2);
            circles[2] = new Circle(5,9,4);
            System.out.println(circles[1].toString());*/
        }
    }
}
