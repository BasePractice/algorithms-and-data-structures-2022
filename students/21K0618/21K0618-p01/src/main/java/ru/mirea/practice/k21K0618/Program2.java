package ru.mirea.practice.k21K0618;

import java.util.Scanner;
public class Program2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int [4];
        int i = 0;
        while (i < 4)
        {
            System.out.println("Введите целое число ");
            A[i] = sc.nextInt();
            i += 1;
        }
        i = 1; int S = A[0]; int max_A = A[0]; int min_A = A[0];
        do
        {
            S += A[i];
            if (A[i] > max_A) max_A = A[i];
            if (A[i] < min_A) min_A = A[i];
            i += 1;
        } while (i < 4);
        System.out.println("Сумма всех элементов массива - " + S + "\nНаименьший элемент массива - " +  min_A + "\nНаибольший - " + max_A);
    }
}
