package ru.mirea.workone;

import java.util.Scanner;

abstract class Second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Задание 1.4");
            System.out.println("Введите длину массива: ");
            int size = input.nextInt();
            int[] array1 = new int[size];
            input.close();
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
        } catch (IncompatibleClassChangeError e) {
            System.out.println("Error");
            input.next();
        } finally {
            input.close();
        }
    }
}

