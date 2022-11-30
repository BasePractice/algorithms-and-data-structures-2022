package ru.mirea.practice.task8;

import java.util.Arrays;
import java.util.Scanner;

abstract class StringRev {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            int n = in.nextInt();
            String[] someStrings = new String[n];
            for (int i = 0; i < n; i++) {
                someStrings[i] = new String(in.next());
            }
            for (int i = 0; i < n / 2; i++) {
                String tmp = someStrings[i];
                someStrings[i] = someStrings[n - i - 1];
                someStrings[n - i - 1] = tmp;
            }
            System.out.println(Arrays.toString(someStrings));
        }
    }

}

