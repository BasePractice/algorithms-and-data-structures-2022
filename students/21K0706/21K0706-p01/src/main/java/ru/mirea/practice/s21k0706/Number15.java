package ru.mirea.practice.s21k0706;

import java.util.Scanner;

public final class Number15 {
    private  Number15() {

    }

    public static int factorial(int a) {
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b *= i;
        }
        return b;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = in.nextInt();
            int b = factorial(n);
            System.out.print("The factorial of the number is: " + b);
        }
    }
}
