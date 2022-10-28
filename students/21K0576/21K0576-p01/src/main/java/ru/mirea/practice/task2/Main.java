package ru.mirea.practice.task2;

import java.util.Scanner;

abstract class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Размер массива: ");
            int arrSize = sc.nextInt();

            int sum = 0;
            int[] arr = new int[arrSize];
            System.out.print("Значения: ");
            for (int a = 0; a < arr.length; ++a) {
                arr[a] = sc.nextInt();
                sum += arr[a];
            }

            sum = 0;
            int a = 0;
            do {
                sum += arr[a];
                ++a;
            } while (a < arr.length);

            System.out.printf(
                    "Сумма через do while: %d\n",
                    sum
            );

            a = 0;
            sum = 0;
            int elemMin = arr[a];
            int elemMax = arr[a];
            while (a < arr.length) {
                sum += arr[a];
                if (arr[a] < elemMin) {
                    elemMin = arr[a];
                }
                if (arr[a] > elemMax) {
                    elemMax = arr[a];
                }
                ++a;
            }

            System.out.printf(
                    "Сумма через while: %d.\nMax: %d. Min: %d\n",
                    sum,
                    elemMax, elemMin
            );
        }
    }
}