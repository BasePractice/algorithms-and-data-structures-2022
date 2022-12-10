package ru.mirea.practice.s21k0627.task5;

public abstract class SumNumbers {
    public static int sumElements(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumElements(n / 10);
    }

    public static void main(String[] args) {
        int n = 1457;
        System.out.println("Summ of elements of number " + n + ": " + SumNumbers.sumElements(n));
        n = 9;
        System.out.println("Summ of elements of number " + n + ": " + SumNumbers.sumElements(n));
    }
}
