package ru.mirea.practice;

import java.util.Scanner;

public class Main {
    public static int fact(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result = result *  i;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Первая практическая работа");
        System.out.println("Задание 1.3");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Введите длину массива:");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * n));
            System.out.println(array[i]);
            sum += array[i];
        }
        double mid = ((double)sum) / n;
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Среднее арифмитическое: " + mid + "\n");

        System.out.println("Задание 1.4");
        System.out.println("Введите длину массива: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array1 = new int[size];
        System.out.println("Введите элементы массива:");
        int i = 0;
        int j = 0;
        int max = 0;
        while (i < size) {
            array1[i] = input.nextInt();
            i++;
        }
        System.out.println("Введите элементы массива:");
        while (j < size) {
            System.out.print(" " + array1[j]);
            j++;
        }
        int count = 0;
        int min = array1[0];
        while (count < size) {
            if (array1[count] > max) {
                max = array1[count];
            }
            if (array1[count] < max) {
                min = array1[count];
            }
            count++;
        }
        System.out.print("\nМаксимально число: " + max + "\nМиинимальное число: " + min + "\n");

        System.out.println("Задание 1.5");
        System.out.print("Введите число: ");
        int num = input.nextInt();
        System.out.printf("Ваше число: %d \n", num);
        System.out.println("\nЗадание 1.6");
        for (int k = 2; k < 10; k++) {
            System.out.println("1/" + k);
        }
        System.out.println("\nЗадание 1.7");
        System.out.println("Введите число: ");
        int pr = input.nextInt();
        System.out.println("\nФакториал числа: ");
        System.out.println(fact(pr));
    }
}
