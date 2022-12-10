package ru.mirea.practice.s21k0627.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Cost {
    public static String parse(String strToParse) {
        Pattern pattern = Pattern.compile("\\b(([1-9]\\d*\\.?)|(0\\.))\\d+\\s*?((USD)|(RUB)|(EU))\\b");
        Matcher matcher = pattern.matcher(strToParse);
        String result = "";
        while (matcher.find()) {
            result += matcher.group() + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(parse("0146 RUB, 0.004 rUb, 13.2 USD, 20023.5 USsD,  577 eu, 73.19 EU"));
    }
}
