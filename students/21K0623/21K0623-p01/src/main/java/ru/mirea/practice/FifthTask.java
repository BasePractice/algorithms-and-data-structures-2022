package ru.mirea.practice;

import java.util.Scanner;

public final class FifthTask {
    private FifthTask()
    {}

    public static void main(String[] args) {
        // Задание 1.7
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Факториал числа: ");
            int temp = sc.nextInt();
            int complete = 1;
            for (int i = 1; i <= temp; i++) {
                complete *= i;
            }

            if (fact(temp) == complete) {
                System.out.println("Совпадает");
            }

            System.out.printf("Факториал числа %d равен %d", temp, complete);
        }
    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}
