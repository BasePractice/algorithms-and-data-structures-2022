package ru.mirea.practice.task1;

import java.util.Locale;

public abstract class Main {
    private static String string;

    public static void inputString(String string) {
        Main.string = string;
    }

    public static boolean isEndsWith(String str) {
        return string.endsWith(str);
    }

    public static boolean startWith(String str) {
        return string.startsWith("I like");
    }

    public static boolean containSubString(String string) {
        return Main.string.contains(string);
    }

    public static int findSubString(String substring) {
        return string.indexOf(substring);
    }

    public static void lastChar() {
        System.out.println(string.charAt(string.length() - 1));
    }

    public static void toLowerRegister() {
        string = string.toLowerCase(Locale.ROOT);
    }

    public static void replaceCharacters(char ch) {
        string = string.replace('a', ch);
    }

    public static void toUpperRegister() {
        string = string.toUpperCase(Locale.ROOT);
    }


    public static String substring(String input) {
        if (string.contains(input)) {
            int in = input.indexOf(string);
            return input.substring(in);
        }
        return input + " not in " + string;

    }

    public static void main(String[] args) {
        inputString("I like Java!!!");
        lastChar();
        System.out.println("end !!!? " + isEndsWith("!!!"));
        System.out.println("start I like? " + startWith("I like"));
        System.out.println(" Java in string " + containSubString("Java"));
        System.out.println("index of Java " + findSubString("Java"));
        System.out.println(string);
        replaceCharacters('o');
        System.out.println("After replace" + string);
        System.out.println(string);
        toUpperRegister();
        System.out.println(string);
        toLowerRegister();
        System.out.println(string);
        System.out.println(substring("Java"));


    }
}