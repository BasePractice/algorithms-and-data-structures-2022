package ru.mirea.practice.ex1;

public class Recursion {
    public static void printNaturalRow(int n) {
        if (n <= 0) {
            return;
        }
        printNaturalRow(n-1);
        for (int i=1;i<=n;i++) {
            System.out.print(n + " ");
        }
    }
}
