package ru.mirea.practice.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Tester {
    public static void main(String[] args) {
        System.out.println("(5 + 2) / 3 " + check("(5 + 2) / 3"));
        System.out.println("(9 - 2) - 9 " + check("(9 - 2) - 9"));
        System.out.println("5 * 7 + 2 " + check("5 * 7 + 2"));
    }

    public static boolean check(String str) {
        Pattern pat = Pattern.compile("\\d+\\s*\\+");
        Matcher match = pat.matcher(str);
        return match.find();
    }
}
