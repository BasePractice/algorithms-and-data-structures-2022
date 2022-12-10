package ru.mirea.practice.s21k0627.task2;

public abstract class Line {
    public static boolean compareStr(String str) {
        return str.matches("abcdefghijklmnopqrstuv18340");
    }

    public static void main(String[] args) {
        System.out.println(compareStr("abcdefgzdhijklmnoasuuuusssdfasdpqrstuv18340"));
        System.out.println(compareStr("abcdefghijklmnopqrstuv18340"));
    }
}
