package ru.mirea.practice;

// 3. Написать программу, в результате которой массив чисел создается с
//помощью инициализации (как в Си) вводится и считается в цикле сумма
//элементов целочисленного массива, а также среднее арифметическое его
//элементов результат выводится на экран. Использовать цикл for.

import java.util.Arrays;

public final class Task1 {

    private Task1() {
    }

    public static void main(String[] args) {

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println("Array : " + Arrays.toString(arr));

        int sum = 0;
        for (int j : arr) {
            sum += j;
        }

        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %s%n", (double) sum / arr.length);
    }
}
