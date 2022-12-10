package ru.mirea.practice.mathematics.task4;

import java.util.Random;
import java.util.Scanner;

abstract class Tester4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите n: ");
            int n = sc.nextInt();
            while (n <= 0) {
                System.out.print("Введите n: ");
                n = sc.nextInt();
            }
            int[] arr1 = new int[n];
            Random t = new Random();
            int count = 0;
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = t.nextInt(n + 1);
                if (arr1[i] % 2 == 0) {
                    count++;
                }
                System.out.print(arr1[i] + " ");
            }
            System.out.print("\n");
            int[] arr2 = new int[count];
            int j = 0;
            for (int k : arr1) {
                if (k % 2 == 0) {
                    arr2[j] = k;
                    System.out.print(arr2[j] + " ");
                    j++;
                }
            }
        }
    }
}
