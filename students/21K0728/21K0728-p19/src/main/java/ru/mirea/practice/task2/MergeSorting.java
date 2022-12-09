package ru.mirea.practice.task2;

public abstract class MergeSorting {
    public static void mergeSort(Student[] arr, int len) {
        if (len < 2) {
            return;
        }
        int mid = len / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[len - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < len; i++) {
            r[i - mid] = arr[i];
        }
        mergeSort(l, mid);
        mergeSort(r, len - mid);
        merge(arr, l, r, mid, len - mid);
    }

    public static void merge(Student[] arr, Student[] l, Student[] r, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left && j < right) {
            if (compare(l[i], r[j]) <= 0) {
                arr[k++] = l[i++];
            } else {
                arr[k++] = r[j++];
            }
        }
        while (i < left) {
            arr[k++] = l[i++];
        }
        while (j < right) {
            arr[k++] = r[j++];
        }
    }


    public static int compare(Student s1, Student s2) {
        if (s1.getGpa() == s2.getGpa()) {
            return 0;
        }
        if (s1.getGpa() > s2.getGpa()) {
            return 1;
        }
        return -1;
    }
}
