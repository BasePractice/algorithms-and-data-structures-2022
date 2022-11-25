package ru.mirea.practice;

// 4. Написать программу, в результате которой массив чисел вводится
//пользователем с клавиатуры считается сумма элементов целочисленного
//массива с помощью циклов do while, while, также необходимо найти
//максимальный и минимальный элемент в массиве, результат выводится на экран.

import java.util.ArrayList;
import java.util.Scanner;

public final class Task2 {

    private Task2() {
    }

    public static void main(String[] args) {

        int listSize;
        ArrayList<Integer> numbers;

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Enter number of elements: ");
            listSize = input.nextInt();
            System.out.println("Enter array:");
            numbers = new ArrayList<>(listSize);

            for (int i = 0; i < listSize; i++) {
                numbers.add(input.nextInt());
            }
        }

        int sum = 0;
        int i = 0;
        while (i < listSize) {
            sum += numbers.get(i);
            i++;
        }

        System.out.printf("Sum of values : %d%n", sum);

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        i = 0;
        while (i < listSize) {
            minValue = Math.min(minValue, numbers.get(i));
            maxValue = Math.max(maxValue, numbers.get(i));
            i++;
        }

        System.out.printf("Max value: %d, min value : %d", maxValue, minValue);
    }
}
