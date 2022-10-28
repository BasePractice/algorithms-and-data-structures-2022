package ru.mirea.practice.task11;

import java.util.Scanner;

public abstract class Sequence {
    public static void main(String[] args) {
        System.out.println("result: " + recurFunc());
    }

    static int recurFunc() {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0) {
                if (b == 0) {
                    return 0;
                } else {
                    return recurFunc() + (b == 1 ? 1 : 0);
                }
            } else {
                if (b == 0) {
                    int c = sc.nextInt();
                    if (c == 0) {
                        return a == 1 ? 1 : 0;
                    } else {
                        return recurFunc() + (a == 1 ? 1 : 0) + (c == 1 ? 1 : 0);
                    }
                } else {
                    return recurFunc() + (a == 1 ? 1 : 0) + (b == 1 ? 1 : 0);
                }
            }
        }
    }
}
