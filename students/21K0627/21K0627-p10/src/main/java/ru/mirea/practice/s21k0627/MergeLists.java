package ru.mirea.practice.s21k0627;

import java.util.Comparator;

public abstract class MergeLists {
    public static Student[] merge(Comparator<Student> comparator, Student[] first, Student[] second) {
        Student[] result = new Student[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (comparator.compare(first[i],second[j]) <= 0) {
                result[k++] = first[i++];
            } else {
                result[k++] = second[j++];
            }
        }
        while (i < first.length) {
            result[k++] = first[i++];
        }
        while (j < second.length) {
            result[k++] = second[j++];
        }
        return result;
    }
}

