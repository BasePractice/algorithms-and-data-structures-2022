package ru.mirea.practice.s21k0709;

//Пятая задача 1 практической работы

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j;
        do {
            System.out.print("Введите факториал числа:");
            j = sc.nextInt(); //считывает целое число из поток ввода и сохраняет в переменную
        } while (j < 0);
        System.out.println(factorial(j));
    }

    public static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        }
        return 1;
    }
}

