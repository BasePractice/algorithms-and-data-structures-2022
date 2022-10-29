package ru.mirea.practice.s21k0647.zadmathrandom.punkt2;

import java.util.Scanner;

public class Tester {
    public static String minP(Circle[] c) {
        double m = 100000;
        Circle cmin = new Circle();
        for (Circle x: c) {
            if (x.r < m) {
                m = x.r;
                cmin = x;
            }
        }
        return cmin.toString();
    }

    public static String maxP(Circle[] c) {
        double m = -1;
        Circle cmax = new Circle();
        for (Circle x: c) {
            if (x.r > m) {
                m = x.r;
                cmax = x;
            }
        }
        return cmax.toString();
    }

    public static void sortP(Circle[] c) {
        for (int i = 0; i < c.length; ++i) {
            for (int j = i + 1; j < c.length; ++j) {
                if (c[i].r > c[j].r) {
                    Circle x = c[i];
                    c[i] = c[j];
                    c[j] = x;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        int n = 3;
        Circle[] c = new Circle[n];
        for (int i = 0; i < n; i++) {
            Circle a = new Circle();
            a.x =  (int)(Math.random() * 100);
            a.y =  (int)(Math.random() * 100);
            a.r =  (int)(Math.random() * 100);
            c[i] = a;
        }
        System.out.println("Circles");
        for (Circle p: c) {
            System.out.println("x: " + p.x + "\ty: " + p.y + "\tRadiuse: " + p.r);
        }

        System.out.println("\nMin Circle: " + minP(c));
        System.out.println("Max Circle: " + maxP(c) + "\n");
        sortP(c);
        System.out.println("Sorteed Circles");
        for (Circle x: c) {
            System.out.println(x.toString());
        }
    }
}
