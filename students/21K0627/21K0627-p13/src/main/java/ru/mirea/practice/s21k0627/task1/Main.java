package ru.mirea.practice.s21k0627.task1;

import java.util.Locale;

public abstract class Main {
    private static String str;

    public static void inputStr(String string) {
        str = string;
    }

    public static void printingStr(String str) {
        System.out.println(str);
    }

    public static void lastChar(String str) {
        System.out.println("Last symbol: " + str.charAt(str.length() - 1));
    }

    public static void endOfStr(String str) {
        if (str.endsWith("!!!")) {
            System.out.println("String ends with '!!!'");
        } else {
            System.out.println("String doesn't end with '!!!'");
        }
    }

    public static void startOfStr(String str) {
        if (str.startsWith("I like")) {
            System.out.println("String begins with 'I like'");
        } else {
            System.out.println("String doesn't begin with 'I like'");
        }
    }

    public static void containsStr(String str) {
        System.out.println("String contains 'Java' - " + str.contains("Java"));
    }

    public static void indexOfStr(String str) {
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
    }

    public static void replaceStr(String str) {
        System.out.println(str.replace("a","o"));
    }

    public static void upperCaseStr(String str) {
        System.out.println(str.toUpperCase(Locale.getDefault()));
    }

    public static void lowerCaseStr(String str) {
        System.out.println(str.toLowerCase(Locale.getDefault()));
    }

    public static String substringStr(String s) {
        if (str.contains(s)) {
            int index = str.indexOf(s);
            return str.substring(index);
        }
        return str + " doesn't contain " + s;
    }

    public static void main(String[] args) {
        inputStr("I like Java !!!");
        printingStr(str);
        lastChar(str);
        endOfStr(str);
        startOfStr(str);
        containsStr(str);
        indexOfStr(str);
        replaceStr(str);
        lowerCaseStr(str);
        upperCaseStr(str);
        System.out.println(substringStr("Java"));
    }
}
