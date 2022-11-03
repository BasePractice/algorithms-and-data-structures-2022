package ru.mirea.practice.s21K0688;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < arr.length) {
            System.out.print("Введите число: ");
            arr[i] = sc.nextInt();
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            i++;
        }
        System.out.print("Сумма элементов массива = ");
        System.out.println(sum);
        System.out.print("Максимальный элемент массива = ");
        System.out.println(max);
        System.out.print("Минимальный элемент массива = ");
        System.out.println(min);
    }
}
