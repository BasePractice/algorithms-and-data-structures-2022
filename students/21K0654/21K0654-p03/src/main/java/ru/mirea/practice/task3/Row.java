package ru.mirea.practice.task3;

import java.util.Random;

public class Row {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(90) + 10;
            System.out.println(arr[i]);
        }
        int f = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                System.out.println("Не является монотонно возрастающей");
                f = 1;
                break;
            }
        }
        if (f == 0) {
            System.out.println("Является монотонно возрастающей");
        }
    }
}
