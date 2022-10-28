package ru.mirea.workthree.task4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = 0;
            System.out.println("Введите целое число N");
            while (n <= 0) {
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("Введено некорректное число. Повторите ввод");
                }
            }
            int[] arr = new int[n];
            Random rand = new Random();
            for (int i = 0; i < n; i++) {
                arr[i] = rand.nextInt(n);
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            ArrayList<Integer> arr2 = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    arr2.add(arr[i]);
                }
            }
            System.out.println("Массив четных элементов:");
            for (int el : arr2) {
                System.out.print(el + " ");
            }
        }
    }
}
