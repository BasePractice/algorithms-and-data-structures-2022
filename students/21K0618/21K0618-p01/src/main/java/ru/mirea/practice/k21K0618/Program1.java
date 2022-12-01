package ru.mirea.practice.k21K0618;

import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[6];
        int S = 0;
        for (int i = 0; i < A.length; i++)
        {
            System.out.println("Введите целое число, " + (i+1) + "-й элемент массива");
            A[i] = sc.nextInt();
            S += A[i];
        }
        System.out.println("Cреднее арифмитеское значение всех элементов массива S = " + ((float) S / A.length));
    }
}
