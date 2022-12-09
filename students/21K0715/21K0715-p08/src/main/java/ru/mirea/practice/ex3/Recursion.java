package ru.mirea.practice.ex3;

public final class Recursion {
    private Recursion() {
    }

    public static void printNaturalRow(int a, int b) {
        if (a == b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.print(a + " ");
            printNaturalRow(a + 1, b);
        } else {
            System.out.print(a + " ");
            printNaturalRow(a - 1, b);
        }

    }
}
