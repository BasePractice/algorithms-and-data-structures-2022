package ru.mirea.practice.s21k0706.p2;


public abstract class Sequence {

    public static String recursion(int n) {
        if (n == 1) {
            return "1";
        } else {
            n--;
            return recursion(n) + " " + (n + 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(recursion(19));
    }

}
