package ru.mirea.practice.task0.task3;

import java.util.Arrays;
import java.util.Random;

public abstract class RandMas {
    public static void main(String[] args) {
        Integer[] mas = new Integer[4];
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = 10 + rand.nextInt(90);
        }
        System.out.println(Arrays.toString(mas));
        boolean flag = true;
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] > mas[i + 1]) {
                flag = false;
                System.out.println("Последовательность не является строго возрастающей");
                break;
            } else {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Последовательность является строго возрастающей");
        }
    }
}
