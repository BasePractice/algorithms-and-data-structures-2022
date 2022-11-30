package ru.mirea.practice.task3;

import java.util.Random;

public abstract class CheckIncreasingSequence {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(90) + 10;
        }

        for (int i : array) {
            System.out.println(i);
        }

        boolean flag = false;
        for (int i = 1; i < 4; i++) {
            if (array[i] <= array[i - 1]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "Возрастающая последовательность" : "Невозрастающая последовательность");
    }
}
