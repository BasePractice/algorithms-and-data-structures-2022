package ru.mirea.practice.task15;

public abstract class NumberRightToLeft {
    public static void main(String[] args) {
        System.out.println(12345);
        recurFunc(12345);
    }

    static void recurFunc(int n) {
        if (n > 0) {
            System.out.print(n % 10 + " ");
            recurFunc(n / 10);
        }
    }
}
