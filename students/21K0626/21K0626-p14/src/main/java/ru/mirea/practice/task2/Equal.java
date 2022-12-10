package ru.mirea.practice.task2;

public abstract class Equal {
    public static boolean eql(String str) {
        return str.matches("abcdefghijklmnopqrstuv18340");
    }

    public static void main(String[] args) {
        System.out.println(eql("abdasewbcdgfddfgdfefghijklmnopqrstuv18340"));
        System.out.println(eql("abcdefghijklmnopqrstuv18340"));
    }
}
