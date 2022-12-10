package ru.mirea.practice.s21k0647.zad3;

import java.util.Scanner;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        System.out.println(new Subtract(new Multiply(new Const(2), new Variable("x")), new Const(3)).evaluate(5));
        try (Scanner sc = new Scanner(System.in)) {
            double v = sc.nextInt();
            System.out.println(new Add(new Subtract(new Variable("x", 2), new Multiply(new Const(2), new Variable("x"))), new Const(1)).evaluate(v));

        }
    }
}
