package ru.mirea.practice.taskFirst;

import java.util.Scanner;

abstract class Program1 {
    public static void main(String[] arguments) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] arr = new int[10];
            boolean errorCode = false;
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                if (scan.hasNextInt()) {
                    arr[i] = scan.nextInt();
                    sum = sum + arr[i];

                } else {
                    System.out.println("Ошибка! Вы ввели не целое число...");
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
