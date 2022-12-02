package ru.mirea.practice;

import java.util.Scanner;

public class Task2 {
    private Task2() {
    }

    public static void main(String[] args) {

        System.out.println("Введите размер массива");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] array = new int[n];
            int i = 0;
            int sum = 0;
            System.out.printf("Введите %d числ(о/а/ел) (>0)\n", n);
            do {
                int a = sc.nextInt();
                array[i] = a;
                sum += a;
                i++;

            } while (i < array.length);

            int argsMax = 0;
            int argsMin = (int) Math.pow(10, 7);
            for (int k : array) {
                if (k > argsMax) {
                    argsMax = k;
                }
                if (k < argsMin) {
                    argsMin = k;
                }
            }
            System.out.println(sum + "   " + sum / n + "   " + argsMin + "   " + argsMax);
        }
    }
}
