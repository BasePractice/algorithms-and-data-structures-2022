package ru.mirea.practice.task1;

public abstract class Triangle {
    public static String recursion(int n) {
        if (n == 1) {
            return "1 ";
        }
        String posled = "";
        for (int i = 1; i < n + 1; i++) {
            posled += n + " ";
        }
        n -= 1;
        return recursion(n) + posled;
    }

    public static void main(String[] args) {
        System.out.println(recursion(4));
    }
}
