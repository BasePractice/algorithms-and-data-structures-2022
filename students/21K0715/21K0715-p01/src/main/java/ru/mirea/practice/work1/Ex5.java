package ru.mirea.practice.work1;

public class Ex5 {
    public static long factorial(long n) {
        long result = 1;
        for (int i = 1; i<=n;i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
