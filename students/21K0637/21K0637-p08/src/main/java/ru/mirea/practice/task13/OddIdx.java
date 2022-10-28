package ru.mirea.practice.task13;

public abstract class OddIdx {
    public static void main(String[] args) {
        recurFunc();
    }

    static void recurFunc() {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            int a = sc.nextInt();
            if (a > 0) {
                int m = sc.nextInt();
                System.out.println(a);
                if (m > 0) {
                    recurFunc();
                }
            }
        }
    }
}
