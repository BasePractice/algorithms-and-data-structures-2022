package ru.mirea.practice;

import java.util.Scanner;

public class ArrayDoWhile {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        do {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Размер должен быть >0");
                }
            } else {
                System.out.println("Введите числовое значение");
                sc = new Scanner(System.in);
            }
        } while (true);
        int[] arr = new int[n];
        System.out.println("Проинициализируйте массив");
        int i = 0;
        while (i < n) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            i++;
        }
        int max = arr[0];
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            } else if (j > max) {
                max = j;
            }
        }
        System.out.println(sum + "   " + sum / n + "   " + min + "   " + max);
    }
}
