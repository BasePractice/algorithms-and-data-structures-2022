package ru.mirea.practice.task3;

import java.util.Scanner;

abstract class Tester {
    public static void main(String[] args) {
        int arraySize;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Размер массива: ");
            arraySize = sc.nextInt();
            Circle[] array = new Circle[arraySize];
            for (int i = 0; i < arraySize; ++i) {
                array[i] = new Circle(new Point(i + 1, arraySize - 1));
                System.out.println(array[i]);
            }
        }
    }
}
