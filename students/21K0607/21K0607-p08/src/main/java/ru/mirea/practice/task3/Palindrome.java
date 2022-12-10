package ru.mirea.practice.task3;

public abstract class Palindrome {
    public static String recurs(String string) {
        if (string.length() == 1) {
            return "yep";
        } else if (string.length() == 2 && string.charAt(0) == string.charAt(1)) {
            return "yep";
        } else {
            if (string.charAt(0) == string.charAt(string.length() - 1)) {
                return recurs(string.substring(1, string.length() - 1));

            } else {
                return "no";
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(recurs("qwerwq"));
    }
}
