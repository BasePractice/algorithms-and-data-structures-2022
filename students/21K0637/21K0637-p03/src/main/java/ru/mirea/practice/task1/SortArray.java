package ru.mirea.practice.task1;

import java.util.Arrays;
import java.util.Random;

public class SortArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }

        System.out.println("\nСгенерированный массив");
        for (int j : array) {
            System.out.print(j + " ");
        }

        System.out.println("\nОтсортированный массив");
        Arrays.sort(array);
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}