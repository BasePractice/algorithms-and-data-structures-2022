package ru.mirea.practice.s21k0706;

import java.util.Scanner;

public final class Number12 {
    private Number12() {

    }

    public static void main(String[] argv) {
        try (Scanner in = new Scanner(System.in)) {
            double s = 0;
            double[] a = new double[10];
            int i = 0;
            do {
                System.out.print("Enter array element: ");
                double n = in.nextDouble();
                a[i] = n;
                s += a[i];
                i++;
            } while (i < a.length);

            i = 0;
            double min = a[0];
            double max = a[0];
            while (i < a.length) {
                if (a[i] < min) {
                    min = a[i];
                }
                if (a[i] > max) {
                    max = a[i];
                }
                i++;
            }

            /* for (int x=0; x<a.length;x++) {
                System.out.print(a[x] + " ");
                System.out.println();
             }*/

            System.out.print("Sum of array elements: " + s);
            System.out.println();
            System.out.print("Min: " + min);
            System.out.println();
            System.out.print("Max: " + max);
        }
    }
}

