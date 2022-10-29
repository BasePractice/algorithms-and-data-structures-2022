package ru.mirea.practice.task1;

import java.util.Arrays;
import java.util.Random;

public class RandArr {
    public static void main(String[] args) {
        double[] arr = new double[20];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 100;
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("---------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("||||||||||||||||||||||||||||||||");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("-------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
