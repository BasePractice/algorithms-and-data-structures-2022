package ru.mirea.practice.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Tester {
    public static void main(String[] args) {
        String string = "3.87 EU, ggh1, 5000 RUB, .63 USD, 54KH, 100 USD,";
        Pattern pat = Pattern.compile("\\d+(|.\\d+) (RUB|USD|EU)");
        Matcher mat = pat.matcher(string);

        while (mat.find()) {
            System.out.println(mat.group());
        }
    }
}
