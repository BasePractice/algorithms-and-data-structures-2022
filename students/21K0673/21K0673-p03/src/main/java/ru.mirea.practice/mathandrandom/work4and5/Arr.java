package ru.mirea.practice.mathandrandom.work4and5;

import java.util.Scanner;

public class Arr {
    private static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int n = in.nextInt();
        while (n <= 0) {
            System.out.println("Enter a NATURAL number: ");
            n = in.nextInt();
        }
        final int min = 0;
        final int max = n;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            final int rnd = rnd(min, max);
            a[i] = rnd;
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");
        int[] b = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            double buff = a[i];
            if (buff % 2 == 0) {
                b[j] = a[i];
                j++;
            }
            if (i == n - 1) {
                int[] c = new int[j];
                for (int k = 0; k < j; k++) {
                    c[k] = b[k];
                    System.out.print(c[k] + " ");
                }
            }
        }
    }
}
