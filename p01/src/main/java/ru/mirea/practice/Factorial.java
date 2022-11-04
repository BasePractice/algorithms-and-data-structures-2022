package ru.mirea.practice;

import java.util.Scanner;

public final class Factorial {
    private Factorial() {
    }

    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите число");
            while (true) {
                if (sc.hasNextInt()) {
                    n = sc.nextInt();
                    if (n > 0) {
                        break;
                    } else {
                        System.out.println("Число должно быть >0");
                    }
                } else {
                    System.out.println("Введите числовое значение");
                    sc.reset();
                }
            }
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
