package ru.mirea.practice.task6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Tester {
    public static void main(String[] args) {
        System.out.println("username@mail.ru " + check("username@mail.ru"));
        System.out.println(" @bk.ru " + check("@bk.ru"));
        System.out.println("mho23@@@com.ru " + check("mho23@@@com.ru"));
        System.out.println("1flappy3@gmail.com " + check("1flappy3@gmail.com"));
    }

    public static boolean check(String str) {
        Pattern pat = Pattern.compile("\\D\\w+@\\w+\\.+\\w+");
        Matcher match = pat.matcher(str);
        return match.matches();
    }
}
