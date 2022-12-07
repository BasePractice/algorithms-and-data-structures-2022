package ru.mirea.practice.factorial;

abstract class Factorial {
    public static int factorial(int n) {
        int sum = 1;
        while (n > 0) {
            sum = sum * n;
            n--;
        }
        return sum;
    }
}
