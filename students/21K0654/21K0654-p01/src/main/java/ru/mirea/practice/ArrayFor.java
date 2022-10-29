package ru.mirea.practice;

import java.util.Scanner;

public class ArrayFor {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        while (true) {
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
        }
        int[] arr = new int[n];
        System.out.println("Проинициализируйте массив");
        for (int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum + "   " + sum / n);
    }
}
