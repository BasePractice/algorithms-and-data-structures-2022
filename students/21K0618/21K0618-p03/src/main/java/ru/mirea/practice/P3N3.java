package ru.mirea.practice;

abstract class P3N3 {
    public static void main(String[] args) {
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = (int) (Math.random() * (99 - 10) + 10);
        }
        boolean p = true;
        System.out.print(a[0] + " ");
        for (int i = 1; i < 4; i++) {
            System.out.print(a[i] + " ");
            if (a[i] <= a[i - 1]) {
                p = false;
            }
        }
        if (p) {
            System.out.println("\nСтрого возрастающая последовательность");
        } else {
            System.out.println("\nНе cтрого возрастающая последовательность");
        }
    }
}
