package ru.mirea.practice.s21k0706.p3;

public abstract class Sequence {

    public static String recursion(Integer a, Integer b) {
        if (b.equals(a)) {
            return a.toString();
        } else if (a > b) {
            b++;
            return recursion(a, b) + " " + (b - 1);
        } else {
            b--;
            return recursion(a, b) + (b + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(19, 5));
    }
}
