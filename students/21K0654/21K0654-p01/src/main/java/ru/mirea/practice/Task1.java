package ru.mirea.practice;

import java.util.Scanner;

public final class Task1 {
    private Task1() {
    }

    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        try (Scanner sc = new Scanner(System.in)) {
            int sum = 0;
            double arithmeticAverage;
            int[] arr = new int[sc.nextInt()];
            System.out.println("Проинициализируйте массив");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            arithmeticAverage = (double) sum / arr.length;
            System.out.println("Cумма: " + sum);
            System.out.println("Ср. арифм: " + arithmeticAverage);
        }
    }

}
