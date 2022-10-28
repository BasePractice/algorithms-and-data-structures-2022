package ru.mirea.workone;

import java.util.Scanner;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] array = new int[10];
            for (int i = 0; i <= (array.length - 1); i++) {
                array[i] = sc.nextInt();
            }
            int sum = 0;
            for (int g = 0; g <= (array.length - 1); g++) {
                sum += array[g];
            }
            System.out.println("Сумма элементов: " + sum);
            System.out.println("Среднее арифметическое: " + sum / 10);


            // Задание 4
            int min = 10000;
            int max = 0;
            int f = 0;
            while (f <= array.length - 1) {
                if (array[f] < min) {
                    min = array[f];
                }
                if (array[f] > max) {
                    max = array[f];
                }
                f++;
            }
            System.out.println("Максимальное число: " + max + ", минимальное число: " + min);


            // Задание 5
            for (int i = 0; i < 10; i++) {
                int a = sc.nextInt();
                System.out.println(a);
            }


            // Задание 6
            for (int i = 1; i < 11; i++) {
                System.out.print(1 / (double) i + " ");
            }
            System.out.println();


            // Задание 7
            int a;
            a = sc.nextInt();
            System.out.println("Факториал числа " + a + ": " + factorial(a));
        }
    }


    public static int factorial(int a) {
        int result = 1;
        for (int i = a; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}