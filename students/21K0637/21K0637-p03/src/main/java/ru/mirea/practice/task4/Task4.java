package ru.mirea.practice.task4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                break;
            } else {
                System.out.println("Ввод не корректен");
                sc = new Scanner(System.in);
            }
        }

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(n + 1);
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        ArrayList<Integer> arrayEven = new ArrayList<>();
        for (int i : array) {
            if (i % 2 == 0 && i != 0) {
                arrayEven.add(i);
            }
        }
        System.out.println("\n");
        for (int i : arrayEven) {
            System.out.print(i + " ");
        }
    }
}
