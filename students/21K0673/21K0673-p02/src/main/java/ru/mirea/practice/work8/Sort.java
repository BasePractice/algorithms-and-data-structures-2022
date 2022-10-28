package ru.mirea.practice.work8;

public class Sort {
    public String[] sort(String[] a, int amount) {
        String buff;
        int i = 0;
        for (int j = amount - 1; ; j--) {
            buff = a[i];
            a[i] = a[j];
            a[j] = buff;
            if (i == j) {
                break;
            } else if (amount % 10 == 0 & i + 1 == j) {
                break;
            }
            i++;
        }
        return a;
    }

    public void print(String[] a, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println(a[i]);
        }
    }
}
