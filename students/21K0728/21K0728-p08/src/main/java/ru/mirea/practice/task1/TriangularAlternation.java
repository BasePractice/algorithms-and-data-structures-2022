package ru.mirea.practice.task1;

public abstract class TriangularAlternation {
    public static String recursion(int n) {
        int c = 0;
        int current = 0;
        if (n == 1) {
            return "1";
        } else {
            for (int i = 1; c < n; i++) {
                c += i;
                current = i;
            }
            return recursion(--n) + " " + current;

        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(10));
    }
}
