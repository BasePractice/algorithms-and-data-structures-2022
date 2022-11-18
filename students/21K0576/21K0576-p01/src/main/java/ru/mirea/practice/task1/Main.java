package ru.mirea.practice.task1;

import java.util.Scanner;

abstract class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Размер массива: ");
            int arrSize = sc.nextInt();
            int sum = 0;
            int[] arr = new int[arrSize];
            System.out.print("Введите значения: ");
            for (int a = 0; a < arr.length; ++a) {
                arr[a] = sc.nextInt();
                sum += arr[a];
            }

            System.out.printf(
                    "Сумма элементов: %d, ср.а.: %f.\n",
                    sum, sum / (float)arrSize
            );
        }
    }
}