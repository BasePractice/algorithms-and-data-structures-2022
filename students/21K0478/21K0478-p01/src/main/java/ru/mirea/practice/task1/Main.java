package ru.mirea.practice.task1;

import java.util.Scanner;

abstract class Main {
    public static void main(String[] args) {
        int sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int[] b = new int[a];
            for (int i = 0; i < a; i++) {
                b[i] = sc.nextInt();
                sum += b[i];
            }
            System.out.print(sum + " " + sum / a);
        }
    }
}
