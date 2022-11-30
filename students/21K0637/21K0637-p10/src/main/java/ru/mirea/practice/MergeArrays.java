package ru.mirea.practice;

import java.util.Comparator;

public abstract class MergeArrays {
    public static Student[] merge(Comparator<Student> comparator, Student[] left, Student[] right) {
        Student[] result = new Student[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (comparator.compare(left[i],right[j]) <= 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
        return result;
    }
}
