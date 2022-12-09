package mirea.practice.s21k0723;

import java.util.Scanner;

public abstract class Factorial {
    public static int factorial(int num) {
        if (num > 1) {
            return factorial(num - 1) * num;
        }
        return 1;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int k;
            do {
                System.out.print("Введите факториал:");
                k = scanner.nextInt(); //считывает целое число из поток ввода и сохраняет в переменную
            } while (k < 0);
            System.out.println(factorial(k));
        }
    }
}