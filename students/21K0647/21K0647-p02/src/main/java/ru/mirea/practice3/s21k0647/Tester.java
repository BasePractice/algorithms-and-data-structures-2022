package ru.mirea.practice3.s21k0647;

import java.util.Scanner;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        try (Scanner source = new Scanner(System.in)) {
            int n;
            n = source.nextInt();
            Circle[] c = new Circle[n];
            for (int i = 0; i < n; i++) {
                Circle a = new Circle();
                a.x = source.nextDouble();
                a.y = source.nextDouble();
                a.r = source.nextDouble();
                c[i] = a;
            }
            for (Circle p : c) {
                System.out.println("x: " + p.x + "\ty: " + p.y + "\tRadiuse: " + p.r);
            }
        }
    }
}
