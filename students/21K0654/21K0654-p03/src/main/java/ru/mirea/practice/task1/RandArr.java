package ru.mirea.practice.task1;

import java.util.Arrays;
import java.util.Random;

public final class RandArr {
    private RandArr() {
    }

    public static void main(String[] args) {
        double[] arr = new double[20];

        Random random = new Random();

        for (double d : arr) {
            d = Math.random() * 100;
            System.out.println(d);
        }
        Arrays.sort(arr);
        System.out.println("---------------------------------");
        for (double d : arr) {
            System.out.println(d);
        }
        System.out.println("||||||||||||||||||||||||||||||||");
        for (double d : arr) {
            d = random.nextInt(100);
            System.out.println(d);
        }
        Arrays.sort(arr);
        System.out.println("-------------------------------");
        for (double d : arr) {
            System.out.println(d);
        }
    }
}
