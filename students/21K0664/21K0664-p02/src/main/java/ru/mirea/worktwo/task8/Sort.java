package ru.mirea.worktwo.task8;

public class Sort {

    public void sort(String[] a, int n) {
        String temp;

        for (int i = 0; i < n / 2; i++) {
            temp = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = temp;
        }
    }

    public void print(String[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}