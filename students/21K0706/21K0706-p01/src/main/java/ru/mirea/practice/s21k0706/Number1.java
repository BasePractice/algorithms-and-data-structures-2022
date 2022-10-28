package ru.mirea.practice.s21k0706;

import java.util.Scanner;

public final class Number1 {
    private Number1() {

    }

    public static void main(String[] argv) {
        try (Scanner in = new Scanner(System.in)) {
            double s = 0;
            double[] a = new double[10];
            for (int i = 0; i < a.length; i++) {
                System.out.print("Enter array element: ");
                double n = in.nextDouble();
                a[i] = n;
                s += a[i];
            }
            /*for (int i=0; i<a.length;i++) {
                System.out.print(a[i] + " ");
            }*/
            double sr;
            sr = s / a.length;
            System.out.print("Sum of array elements: " + s);
            System.out.println();
            System.out.print("Arithmetic mean of array elements: " + sr);
        }
    }
}