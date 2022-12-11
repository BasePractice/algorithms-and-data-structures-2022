package ru.mirea.practice.task3;

public abstract class MergeSort {
    public static void mergeSort(Student[] mass, int length) {
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = mass[i];
        }
        for (int i = mid; i < length; i++) {
            right[i - mid] = mass[i];
        }
        mergeSort(left, mid);
        mergeSort(right, length - mid);
        merge(mass, left, right, mid, length - mid);
    }

    public static void merge(Student[] mass, Student[] left, Student[] right, int left2, int right1) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left2 && j < right1) {
            if (compare(left[i], right[j]) <= 0) {
                mass[k++] = left[i++];
            } else {
                mass[k++] = right[j++];
            }
        }
        while (i < left2) {
            mass[k++] = left[i++];
        }
        while (j < right1) {
            mass[k++] = left[j++];
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
