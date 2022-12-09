package ru.mirea.practice.s21k0627.task2;

public abstract class NaturalNumbers {
    public static int printing(int i, int n) {
        if (i == n) {
            System.out.print(i);
            return 0;
        }
        System.out.print(i + ", ");
        return printing(i + 1, n);
    }

    public static void main(String[] args) {
        NaturalNumbers.printing(1, 10);
    }
}
