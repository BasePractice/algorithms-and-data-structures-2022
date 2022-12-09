package ru.mirea.practice.ex3;

import java.util.Scanner;

public final class Main {
    private Main() {
    }

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        Recursion.printNaturalRow(a, b);
    }
}
