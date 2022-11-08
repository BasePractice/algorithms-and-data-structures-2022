package ru.mirea.practice;

import java.util.Scanner;

public abstract class Number1 {

    public static void initMassive(int length) {

        int sum = 0;

        int[] massive = new int[length];
        try (Scanner in = new Scanner(System.in)) {
            for (int i = 0; i < length; i++) {
                massive[i] = in.nextInt();
                sum += massive[i];
            }

            double average = sum / (double) length;
            System.out.println("Sum= " + sum + "\n" + "Average= " + average);

        }

    }

    public static void minMax(int length) {

        int[] massive = new int[length];
        try (Scanner in = new Scanner(System.in)) {

            int sum = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int i = 0;
            while (i < length) {
                massive[i] = in.nextInt();
                sum += massive[i];
                if (min > massive[i]) {
                    min = massive[i];
                }
                if (max < massive[i]) {
                    max = massive[i];
                }
                i++;
            }


            System.out.println("Sum= " + sum + "\n Max= " + max + "\n Min= " + min);
        }
    }

    public static void printArgs(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }

    public static void printHarmonicSeries(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i + " ,");
        }
        System.out.println(" ");
    }

    public static int factocialFunction(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            System.out.println(factorial);
        }
        return factorial;
    }



    public static void main(String[] args) {
        System.out.println("Print args");
        printArgs(args);
        System.out.println("Factorial");
        factocialFunction(2);
        System.out.println("massive initialisation");
        initMassive(3);
        System.out.println("min max");
        minMax(3);
        System.out.println("Harmonic Series");
        printHarmonicSeries(5);

    }
}

