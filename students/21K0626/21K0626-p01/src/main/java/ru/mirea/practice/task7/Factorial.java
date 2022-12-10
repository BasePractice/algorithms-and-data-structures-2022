package ru.mirea.practice.task7;

abstract class Factorial {
    public static int fact(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        return f;
    }
}
