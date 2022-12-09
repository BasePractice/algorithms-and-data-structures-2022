package ru.mirea.practice.work1;

import java.util.Scanner;

public final class Ex2 {
    private Ex2() {

    }

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity of numbers:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int summa = 0;
        System.out.println("Enter numbers:");
        while (n > 0) {
            array[n - 1] = scanner.nextInt();
            summa += array[n - 1];
            n -= 1;
        }
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            } else if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Summa: " + summa + "\nMax:   " + max + "\nMin:   "
                + min);
    }
}
