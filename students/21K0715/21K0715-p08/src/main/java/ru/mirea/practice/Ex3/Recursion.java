package ru.mirea.practice.Ex3;

public class Recursion {
    public static void printNaturalRow(int A, int B) {
        if (A == B) {
            System.out.println(A);
        } else if (A < B) {
            System.out.print(A + " ");
            printNaturalRow(A+1, B);
        } else {
            System.out.print(A + " ");
            printNaturalRow(A - 1, B);
        }

    }
}
