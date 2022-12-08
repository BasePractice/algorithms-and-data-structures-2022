package ru.mirea.practice.factorial;

abstract class Factorial {
    public static int factorial(int k) {
        int sum = 1;
        while (k > 0) {
            sum = sum * k;
            k--;
        }
        return sum;
    }
}
