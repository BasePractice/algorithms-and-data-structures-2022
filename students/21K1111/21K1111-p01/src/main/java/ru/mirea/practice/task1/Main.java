package ru.mirea.practice.task1;

import java.util.Scanner;

public abstract class Main {
    public static void initMassive(int ln) {
        int yy = 0;
        int[] n = new int[ln];
        try (Scanner in = new Scanner(System.in)) {
            for (int j = 0; j < ln; j++) {
                n[j] = in.nextInt();
                yy += n[j];
            }

            double sred = yy / (double) ln;
            System.out.println("Sum= " + yy + "\n" + "Average= " + sred);

        }

    }

    public static void chitalka(int ln) {

        int[] n = new int[ln];
        try (Scanner in = new Scanner(System.in)) {

            int yy = 0;
            int less = Integer.MAX_VALUE;
            int more = Integer.MIN_VALUE;
            int j = 0;
            while (j < ln) {
                n[j] = in.nextInt();
                yy += n[j];
                if (less > n[j]) {
                    less = n[j];
                }
                if (more < n[j]) {
                    more = n[j];
                }
                j++;
            }


            System.out.println("Sum= " + yy + "\n Max= " + more + "\n Min= " + less);
        }
    }

    public static void vivod(String[] k) {
        for (int j = 0; j < k.length; j++) {
            System.out.println("Argument " + j + ": " + k[j]);
        }
    }

    public static void vivod2(int k) {
        for (int j = 1; j <= k; j++) {
            System.out.print("1/" + j + " ,");
        }
        System.out.println(" ");
    }

    public static int fact(int k) {
        int factor = 1;
        for (int j = 1; j <= k; j++) {
            factor *= j;
            System.out.println(factor);
        }
        return factor;
    }



    public static void main(String[] args) {
        System.out.println("Print args");
        vivod(args);
        System.out.println("Factorial");
        fact(2);
        System.out.println("Massive initialisation");
        initMassive(3);
        System.out.println("min and max");
        chitalka(3);
        System.out.println("Harmonic Series");
        vivod2(5);

    }
}
