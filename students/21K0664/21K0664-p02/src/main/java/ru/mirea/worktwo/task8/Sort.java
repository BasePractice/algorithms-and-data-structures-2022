package ru.mirea.worktwo.task8;

public class Sort {
    Sort() {
    }

    public String[] sort(String[] a, int n) {
        String buff;
        boolean deleteMe = false;
        for (int i = 0; ; ) {
            for (int j = n - 1; ; ) {
                buff = a[i];
                a[i] = a[j];
                a[j] = buff;
                if (i == j) {
                    break;
                } else {
                    // FIXME: Ошибка?
                    if (n % 10 == 0 & i + 1 == j) {
                        deleteMe = true;
                        break;
                    }
                }
                i++;
                j--;
            }
            // FIXME: Не понятна логика
            if (deleteMe) {
                break;
            }
        }
        return a;
    }

    public void print(String[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}