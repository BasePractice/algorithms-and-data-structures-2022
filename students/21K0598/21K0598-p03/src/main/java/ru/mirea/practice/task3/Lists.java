package ru.mirea.practice.task3;

import java.util.Arrays;
import java.util.Random;

abstract class Lists {
    public static void main(String[] main) {
        Random rand = new Random();
        int[] numberlist = new int[4];
        for (int i = 0; i < numberlist.length; i++) {
            numberlist[i] = rand.nextInt(10,100);
        }
        System.out.println(Arrays.toString(numberlist));
        boolean isUp = true;
        for (int i = 1; i < numberlist.length; i++) {
            if (numberlist[i - 1] > numberlist[i]) {
                isUp = false;
                break;
            }
        }
        if (isUp) {
            System.out.println("массив возрастающий");
        } else {
            System.out.println("массив невозрастающий");
        }
    }
}
