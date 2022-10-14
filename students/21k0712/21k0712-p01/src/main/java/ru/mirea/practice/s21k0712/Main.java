package ru.mirea.practice.s21k0712;

import java.util.Scanner;
public final class Main {
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("Введите количество элементов массива");
            int[] a = new int[sc.nextInt()];
            double sum = 0, min = 9999999, max = 0;
            System.out.println("Введите элементы массива");
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                sum += a[i];

            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println("\nСумма: " + sum);
            System.out.println("Ср арифм: " + sum / a.length);
            int j = 0;
            while (j < a.length) {
                if (a[j] >= max) max = a[j];
                if (a[j] <= min) min = a[j];
                j++;
            }
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
            System.out.println("Гармонический ряд до какого числа");
            int k = sc.nextInt();
            for (double i = 1; i <= k; i++) {
                System.out.print(1 / i + " ");
            }
            System.out.println("\nФакториал до введенного ранее числа");
            System.out.println(fact(k));
        }

        public static double fact(int k) {
            double fact = 1;
            for (double i = 1; i <= k; i++) {
                fact *= i;
            }
            return fact;
        }
    }