package ru.mirea.practice;

import java.util.Scanner;

abstract class Program2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[10];
            int i = 0;
            int sum = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            System.out.println(arr.length);
            while (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
                sum += arr[i];
                i++;
                if (i == arr.length) {
                    break;
                }
            }
            System.out.println(sum);
            System.out.println("\n");
            System.out.println(min);
            System.out.println("\n");
            System.out.println(max);
        }
    }
}
