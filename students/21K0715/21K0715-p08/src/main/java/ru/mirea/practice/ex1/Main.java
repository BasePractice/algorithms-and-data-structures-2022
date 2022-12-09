package ru.mirea.practice.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Recursion.printNaturalRow(input);
    }
}
