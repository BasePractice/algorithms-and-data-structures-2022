package ru.mirea.practice.task2;

public abstract class Posledov {
    public static String recurs(int n) {
        if (n == 1) {
            return "1 ";
        }
        String f = "";
        f += n + " ";
        return recurs(n - 1) + f;
    }

    public static void main(String[] args) {
        System.out.println(recurs(10));
    }
}
