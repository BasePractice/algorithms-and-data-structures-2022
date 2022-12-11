package ru.mirea.practice.task3;

import java.util.Random;

abstract class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[4];
        for (int i = 0; i < 4; ++i) {
            arr[i] = rand.nextInt(100 - 10) + 10;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print('\n');

        Boolean grows = true;
        int prevElem = -1;
        for (int i : arr) {
            if (prevElem >= i) {
                grows = false;
                break;
            }
            prevElem = i;
        }

        System.out.printf(
                "Массив %sявляется строго возрастающей последовательностью.\n",
                grows ? "" : "не "
        );
    }
}
