package ru.mirea.practice.mathematics.task3;

import java.util.Random;

abstract class Tester3 {
    public static void main(String[] args) {
        Random temp = new Random();
        int[] arr = new int[5];
        boolean bl = true;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp.nextInt(89) + 10;
            System.out.print(arr[i] + " ");
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                bl = false;
                break;
            }
        }
        System.out.print("\n");
        if (bl) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}
