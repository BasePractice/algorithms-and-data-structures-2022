package ru.mirea.practice.task8;

public class Sort {
    Sort() {}

    public String[] sort(String[]a,int n) {
        String buff;
        for (int i = 0;;) {
            for (int j = n - 1; ; ) {
                buff = a[i];
                a[i] = a[j];
                a[j] = buff;
                if (i == j) {
                    break;
                } else {

                    if (n % 10 == 0 & i + 1 == j) {
                        break;
                    }
                }
                i++;
                j--;
            }
            break;
        }
        return a;
    }

    public void print(String[]a,int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}