package ru.mirea.practice;
import java.util.Scanner;

abstract class ClassFive {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter your number: \n");
            int n = in.nextInt();
            System.out.println(factorial(n));
        } finally {
            in.close();
        }
    }
}
