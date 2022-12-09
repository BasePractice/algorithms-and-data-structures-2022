package ru.mirea.practice.task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Main {
    public static boolean isSameString(String str) {
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println(isSameString(in.nextLine()));
        }
    }
}
