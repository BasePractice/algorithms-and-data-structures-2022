package ru.mirea.practice.ex2;

import java.util.Scanner;

public final class Main {
    private Main() {
    }

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        Recursion.printNaturalRow(input);
    }
}
