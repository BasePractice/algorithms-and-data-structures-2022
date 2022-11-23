package ru.mirea.practice.s21K0627;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Введите длину массива: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            }
        } while (n < 0);
        int in;
        int j = 0;
        int[] arr = new int[n];
        System.out.println("Введите массив: ");
        while (j < arr.length) {
            in = sc.nextInt();
            arr[j] = in;
            j++;
        }
        int maxNumber = arr[0];
        int minNumber = arr[0];
        int sum = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] < minNumber) {
                minNumber = arr[k];
            }
            if (arr[k] > maxNumber) {
                maxNumber = arr[k];
            }
            sum += arr[k];
        }
        System.out.println();
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Макс элемент массива: " + maxNumber);
        System.out.println("Мин элемент массива: " + minNumber);
    }
}
