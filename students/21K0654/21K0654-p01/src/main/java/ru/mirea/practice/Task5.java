package ru.mirea.practice;

import java.util.Scanner;

public final class Task5 {
    private Task5() {
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int res = fact(n);
            System.out.println(res);
        }
    }

}
