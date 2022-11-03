package ru.mirea.practice.s21K0688;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1, 5, 13, 2, 6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float avg = sum / 5f;
        System.out.print("Среднее арифметическое = ");
        System.out.println(avg);
    }
}