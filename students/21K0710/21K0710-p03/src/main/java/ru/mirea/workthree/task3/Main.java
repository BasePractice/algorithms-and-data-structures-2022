package ru.mirea.workthree.task3;

import java.util.Random;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = rand.nextInt(90) + 10;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int k = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i] > arr[i + 1]) {
                break;
            } else {
                k++;
            }
        }
        if (k == 3) {
            System.out.println("Массив - строго возрастающая последовательность");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
