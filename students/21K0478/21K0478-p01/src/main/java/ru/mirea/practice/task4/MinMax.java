package ru.mirea.practice.task4;

import java.util.Scanner;

abstract class MinMax {
    public static void main(String[] args) {
        int a;
        int[] b;
        int sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
            b = new int[a];
            for (int i = 0; i < a; i++) {
                b[i] = sc.nextInt();
                sum += b[i];
            }
        }
        int value = 0;
        int i = 0;
        while (i < a) {
            value = b[0];
            if (b[i] < value) {
                value = b[i];
            }
            i++;
        }
        i = 0;
        System.out.print("" + "Min " + value);
        int value1 = 0;
        while (i < a) {
            value1 = b[0];
            if (b[i] < value1) {
                value1 = b[i];
            }
            i++;
        }
        System.out.print(" " + "Max " + " " + value1);
        System.out.print(" " + sum + " " + sum / a);


    }
}


