package ru.mirea.practice.task8;

import java.util.Arrays;

public abstract class Reverse {
    public static void sort(String[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            String t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;

        }
        System.out.println("arr: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        String[] arr = {"war", "toy", "rot"};
        sort(arr);
    }

}

