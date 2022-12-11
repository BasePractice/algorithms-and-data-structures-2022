package ru.mirea.practice.task1;

import java.util.Arrays;
import java.util.Random;

abstract class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        float[] arr = new float[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = rand.nextFloat();
        }
        printArr(arr);

        for (int i = 0; i < size; ++i) {
            arr[i] = (float)(Math.random() * 100);
        }
        printArr(arr);

        Arrays.sort(arr);
        printArr(arr);
    }

    static final int size = 10;

    static void printArr(float[] arr) {
        for (float i : arr) {
            System.out.printf("%.2f ", i);
        }
        System.out.printf("\n");
    }
}
