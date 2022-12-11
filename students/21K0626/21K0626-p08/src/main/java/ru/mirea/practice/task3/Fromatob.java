package ru.mirea.practice.task3;

public abstract class Fromatob {
    public static int recursion(int a, int b) {
        if (a < b) {
            if (a == b) {
                return a;
            }
            System.out.println(a);
            a += 1;
            return recursion(a, b);
        } else {
            if (a == b) {
                return a;
            }
            System.out.println(b);
            b += 1;
            return recursion(b, a);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(4, 10));
    }
}
