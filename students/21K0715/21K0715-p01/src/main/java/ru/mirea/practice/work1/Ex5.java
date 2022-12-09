package ru.mirea.practice.work1;

public final class Ex5 {
    public static final int N = 10;

    private Ex5() {

    }

    public static long factorial(final long n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(final String[] args) {
        System.out.println(factorial(N));
    }
}
