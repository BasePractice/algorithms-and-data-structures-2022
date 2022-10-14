package ru.mirea.practice.s21K0712;

import java.util.Scanner;
public final class Main {
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            int[] a = new int[sc.nextInt()];
            double sum = 0, min = 9999999, max = 0;

            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
                System.out.println(sc);
                System.out.println(a[i]);
            }
            System.out.println("Summa: " + sum);
            System.out.println("Sr arifm: " + sum / a.length);
            int j = 0;
            while (j < a.length) {
                if (a[j] >= max) max = a[j];
                if (a[j] <= min) min = a[j];
                j++;
            }
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);

            int k = sc.nextInt();
            for (double i = 1; i <= k; i++) {
                System.out.print(1 / i + " ");
            }
        }

        public static double fact(int k) {
            double fact = 1;
            for (double i = 1; i <= k; i++) {
                fact *= i;
            }
            System.out.println("\n" + fact);
            return fact;
        }
    }