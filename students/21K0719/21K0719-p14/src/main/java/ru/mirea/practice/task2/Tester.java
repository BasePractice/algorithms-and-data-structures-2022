package ru.mirea.practice.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Tester {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher mat = pat.matcher("abcdefghijklmnopqrstuv18340");
        boolean b1 = mat.matches();
        Matcher mat2 = pat.matcher("abcdefghijklmnoasdfasdpqrsutuv18340");
        boolean b2 = mat2.matches();

        System.out.println(b1);
        System.out.println(b2);
    }
}

