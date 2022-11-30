package ru.mirea.practice.task16;

import java.util.Scanner;

public abstract class MaxValue {
    public static void main(String[] args) {
        recurFunc(0, 0);
    }

    private static void recurFunc(int max, int count) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        if (n != 0) {
            if (n > max) {
                recurFunc(n, 1);
            } else {
                if (n == max) {
                    recurFunc(max, ++count);
                } else {
                    recurFunc(max, count);
                }
            }
        } else {
            System.out.println(count);
        }
    }
}
