package ru.mirea.practice.task1;

import java.util.Arrays;

public final class Test {

    private Test() {
    }

    public static void insertionSort(Comparable[] sortArr) {
        int j;
        for (int i = 1; i < sortArr.length; i++) {
            Comparable temp = sortArr[i];
            for (j = i; j > 0 && temp.compareTo(sortArr[j - 1]) < 0; j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = temp;
        }
    }

    public static void main(String[] args) {

        Student[] students = new Student[]{new Student("Ivan", 24),
            new Student("Pavel", 37), new Student("Maxim", 4),};
        System.out.println(Arrays.toString(students));

        insertionSort(students);
        System.out.println(Arrays.toString(students));

    }
}

