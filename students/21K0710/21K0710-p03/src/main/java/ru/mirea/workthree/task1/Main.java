package ru.mirea.workthree.task1;

import java.util.Arrays;
import java.util.Random;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        double[] arr = new double[10];
        for (int i = 0; i < 5; i++) {
            arr[i] = Math.random();
        }
        Random rand = new Random();
        for (int i = 5; i < 10; i++) {
            arr[i] = rand.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
