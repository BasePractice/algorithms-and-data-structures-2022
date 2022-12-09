package ru.mirea.practice.task2;

/*Написать тестовый класс, который создает массив класса Student и
сортирует массив iDNumber и сортирует его вставками.*/


import java.util.Arrays;

public final class SortingStudentsByGpa {

    private SortingStudentsByGpa() {
    }

    public static void quickSort(Comparable[] sortArr, int order) {
        order = order > 0 ? 1 : -1;
        sort(sortArr, 0, sortArr.length - 1, order);
    }

    private static void sort(Comparable[] sortArr, int low, int high, int order) {

        if (sortArr.length == 0 || low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        Comparable border = sortArr[middle];

        int i = low;
        int j = high;
        while (i <= j) {
            while (sortArr[i].compareTo(border) * order < 0) {
                i++;
            }
            while (sortArr[j].compareTo(border) * order > 0) {
                j--;
            }
            if (i <= j) {
                Comparable swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }

        if (low < j) {
            sort(sortArr, low, j, order);
        }
        if (high > i) {
            sort(sortArr, i, high, order);
        }
    }

    public static void main(String[] args) {

        Student[] students = new Student[]{ new Student("Ivan", 24, 4),
            new Student("Pavel", 37, 5), new Student("Maxim", 4, 3),};
        System.out.println(Arrays.toString(students));

        quickSort(students, -1);
        System.out.println(Arrays.toString(students));
    }
}
