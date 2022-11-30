package ru.mirea.practice.task12;

public abstract class OddNumber {
    public static void main(String[] args) {
        recurFunc();
    }

    static void recurFunc() {
        int a;
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            a = sc.nextInt();
        }
        if (a > 0) {
            if (a % 2 == 1) {
                System.out.println(a);
                recurFunc();
            } else {
                recurFunc();
            }
        }
    }
}
