package ru.mirea.practice.task1;

import java.util.Locale;

public abstract class Strings {
    private static String string;

    public static void str(String s) {
        string = s;
    }

    public static void printSt(String s) {
        System.out.println(s);
    }

    public static void last(String s) {
        System.out.println(s.charAt(s.length() - 1));
    }

    public static void end(String s) {
        if (s.endsWith("!!!")) {
            System.out.println("Заканчивается на !!!");
        } else {
            System.out.println("Не заканчивается на !!!");
        }
    }

    public static void start(String s) {
        if (s.startsWith("I like")) {
            System.out.println("Начинается на I like");
        } else {
            System.out.println("Не начинается на I like");
        }
    }

    public static void contains(String s) {
        System.out.println(s.contains("Java"));
    }

    public static void position(String s) {
        System.out.println(s.indexOf("Java"));
    }

    public static void replace(String s, String ch1, String ch2) {
        System.out.println(s.replace(ch1,ch2));
    }

    public static void upper(String s) {
        System.out.println(s.toUpperCase(Locale.getDefault()));
    }

    public static void lower(String s) {
        System.out.println(s.toLowerCase(Locale.getDefault()));
    }

    public static String sub(String s) {
        if (string.contains(s)) {
            int index = string.indexOf(s);
            return string.substring(index);
        }
        return s + " не содержит " + string;
    }

    public static void main(String[] args) {
        str("I like Java!!!");
        printSt(string);
        end(string);
        last(string);
        position(string);
        contains(string);
        start(string);
        upper(string);
        replace(string,"a","o");
        lower(string);
        System.out.println(sub("Java"));
    }

}
