package ru.mirea.practice;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Введите целое число, " + (i + 1) + "-й элемент массива");
            a[i] = sc.nextInt();
            s += a[i];
        }
        System.out.println("Cреднее арифмитеское значение всех элементов массива s = " + ((float) s / a.length));
    }
}
