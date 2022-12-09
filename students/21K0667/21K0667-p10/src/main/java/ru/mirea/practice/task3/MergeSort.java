package ru.mirea.practice.task3;

import ru.mirea.practice.task2.Student;

public abstract class MergeSort {
    public static void mergeSort(Student[] mass, int length) {
        if (length < 2) {
            return;
        }
        int middle = length / 2;
        Student[] left = new Student[middle];
        Student[] right = new Student[length - middle];
        for (int i = 0; i < middle; i++) {
            left[i] = mass[i];
        }
        for (int i = middle; i < length; i++) {
            right[i - middle] = mass[i];
        }
        mergeSort(left, middle);
        mergeSort(right, length - middle);
        merge(mass, left, right, middle, length - middle);
    }

    public static void merge(Student[] mass, Student[] left, Student[] right, int left2, int right2) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left2 && j < right2) {
            if (compare(left[i], right[j]) <= 0) {
                mass[k++] = left[i++];
            } else {
                mass[k++] = right[j++];
            }
        }
        while (i < left2) {
            mass[k++] = left[i++];
        }
        while (j < right2) {
            mass[k++] = right[j++];
        }
    }


    public static int compare(Student one, Student two) {
        if (one.getGpa() == two.getGpa()) {
            return 0;
        }
        if (one.getGpa() > two.getGpa()) {
            return 1;
        }
        return -1;
    }
}
