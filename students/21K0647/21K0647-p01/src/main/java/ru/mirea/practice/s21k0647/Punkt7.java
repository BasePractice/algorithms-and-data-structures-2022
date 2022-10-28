package ru.mirea.practice.s21k0647;

import java.util.Scanner;

public final class Punkt7 {
    private Punkt7() {

    }

    public static int factorial(int a) {
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b *= i;
        }
        return b;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int b = factorial(n);
            System.out.print(b);
        }
    }
}
