package ru.mirea.practice.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Tester {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("This is pretty simple string, try to repeat...");
        Matcher match1 = pat.matcher("This is pretty simple string, try to repeat...");
        boolean b1 = match1.matches();
        Matcher match2 = pat.matcher("This is not pretty simple string, can not try to repeat...");
        boolean b2 = match2.matches();

        System.out.println("string 1 matches: " + b1);
        System.out.println("string 2 matches: " + b2);
    }
}
