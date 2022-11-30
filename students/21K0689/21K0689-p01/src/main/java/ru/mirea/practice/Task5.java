package ru.mirea.practice;

abstract class Task5 {
    public static int fact(int x) {
        if (x > 1) {
            return x * fact(x - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println(fact(a));
    }
}
