package ru.mirea.practice;

import java.util.Scanner;

abstract class Program1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[10];
            boolean errorCode = false;
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                if (sc.hasNextInt()) {
                    arr[i] = sc.nextInt();
                    sum = sum + arr[i];

                } else {
                    System.out.println("Вы ввели не целое число");
                    errorCode = true;
                    break;
                }
            }
            if (!errorCode) {
                System.out.println(sum / arr.length);
            }
        }
    }
}
