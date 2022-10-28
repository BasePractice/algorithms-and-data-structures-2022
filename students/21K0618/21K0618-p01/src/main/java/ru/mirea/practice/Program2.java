package ru.mirea.practice;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        int i = 0;
        while (i < 4) {
            System.out.println("Введите целое число ");
            a[i] = sc.nextInt();
            i += 1;
        }
        i = 1;
        int s = a[0];
        int maxA = a[0];
        int minA = a[0];
        do {
            s += a[i];
            if (a[i] > maxA) {
                maxA = a[i];
            }
            if (a[i] < minA) {
                minA = a[i];
            }
            i += 1;
        } while (i < 4);
        System.out.println("Сумма всех элементов массива - " + s + "\nНаименьший элемент массива - " + minA + "\nНаибольший - " + maxA);
    }
}
