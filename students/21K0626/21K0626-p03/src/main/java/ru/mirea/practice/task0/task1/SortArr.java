package ru.mirea.practice.task0.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public abstract class SortArr {
    public static void main(String[] args) {
        Random rand = new Random();

        try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(999);
        }
        System.out.println("arr: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        System.out.println("arr_sorted: " + Arrays.toString(arr));
            sc.close();
        }
    }
}
