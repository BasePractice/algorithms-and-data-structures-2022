package ru.mirea.practice.task4;

import java.util.Scanner;

abstract class Max {
    public static void main(String[] args) {
        int[] a = new int[5];
        int sum = 0;
        try(Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            sc.close();
        }
        //System.out.println("\n");
        System.out.println(sum / a.length);
        for (int j : a) {
            System.out.print(j + " ");
        }
        int[] a1 = new int[5];
        try(Scanner sc1 = new Scanner(System.in)) {
            for (int i = 0; i < a1.length; i++) {
                a1[i] = sc1.nextInt();
            }
        }
        int sum1 = 0;
        int max = a[0];
        int min = a[0];
        int i = 0;
        while (i < a.length) {
            System.out.print(a[i] + " ");
            sum1 += a1[i];
            if (a[i] > max) {
                max = a[i];
            }
            if (a1[i] < min) {
                min = a[i];
            }
            i++;

        }
        System.out.println("\n" + "Sum:" + sum + "\n" + "max:" + max + "  " + "min:" + min);
    }
}
