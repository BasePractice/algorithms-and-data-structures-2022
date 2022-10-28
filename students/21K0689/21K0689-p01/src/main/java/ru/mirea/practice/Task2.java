package ru.mirea.practice;

import java.util.Scanner;

abstract class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter size of array: ");
            int size = sc.nextInt();
            int[] a = new int[size];
            for (int n = 0; n < size; n++) {
                a[n] = sc.nextInt();
            }
            int b = 0;
            int sum = 0;
            while (b < a.length) {
                sum += a[b];
                b++;
            }
            System.out.println("sum = " + sum);
            sum = 0;
            b = 0;
            do {
                sum += a[b];
                b++;
            } while (b < a.length);
            System.out.println("sum = " + sum);

            int max = 0;
            int min = a[0];
            for (int i = 0; i < size; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
            for (int i = 0; i < size; i++) {
                if (a[i] < min) {
                    min = a[i];
                }
            }
            System.out.println("min = " + min);
            System.out.println("max = " + max);
            sc.close();
        } catch (IncompatibleClassChangeError e) {
            System.out.println("Error");
            sc.next();
        } finally {
            sc.close();
        }
    }
}
