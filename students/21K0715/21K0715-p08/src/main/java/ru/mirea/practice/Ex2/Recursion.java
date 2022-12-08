package ru.mirea.practice.Ex2;

public class Recursion {
    public static void printNaturalRow(int n) {
        if (n <= 0) {
            return;
        }
        printNaturalRow(n-1);
        System.out.print(n + " ");
    }
}
