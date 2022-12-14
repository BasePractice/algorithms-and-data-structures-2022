package ru.mirea.practice.task1;

import java.util.Random;

public class RandomNumbers {

    public Integer[] randomArray(int size) {
        Integer[] array = new Integer[size];
        Random rd = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rd.nextInt();
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        bubbleSort(array);
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        return array;
    }

    public Integer[] mathRandomArray(int size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 25);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        bubbleSort(array);
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        return array;
    }


    public static void bubbleSort(Integer[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int h = 0; h < array.length - i - 1; h++) {
                Integer temp = array[h];
                if (array[h] > array[h + 1]) {
                    array[h] = array[h + 1];
                    array[h + 1] = temp;
                }
            }
        }
    }
}
