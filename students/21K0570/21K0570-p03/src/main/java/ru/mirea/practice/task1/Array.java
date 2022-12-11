package ru.mirea.practice.task1;

import java.util.Arrays;

public abstract class Array {
    private static void swap(double[] array, int i1, int i2) {
        double t = array[i1];
        array[i1] = array[i2];
        array[i2] = t;
    }

    public static void main(String[] args) {
        double[] mass = new double[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Math.random() * 100;
        }
        System.out.println("random mass = " + Arrays.toString(mass));
        boolean f = true;
        while (f) {
            f = false;
            for (int i = 1; i < mass.length; i++) {
                if (mass[i] < mass[i - 1]) {
                    swap(mass, i, i - 1);
                    f = true;
                }
            }
        }
        System.out.println("sorted mass = " + Arrays.toString(mass));
    }
}

