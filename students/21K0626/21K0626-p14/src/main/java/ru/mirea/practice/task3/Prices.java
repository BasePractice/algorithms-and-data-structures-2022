package ru.mirea.practice.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Prices {
    public static List<String> price(String strToParse) {
        Pattern pat = Pattern.compile("\\b(([1-9]\\d*\\.?)|(0\\.))\\d+\\s*?((USD)|(RUB)|(EU))\\b");
        Matcher match = pat.matcher(strToParse);
        List<String> parse = new ArrayList<>();
        while (match.find()) {
            parse.add(match.group());

        }
        return parse;

    }

    public static void main(String[] args) {
        List<String> price = price("10.2 USD, 2423.5 usd, 03212 RUB,"
                + " 2.23 rub, 112 eu, 100.2 EU, 12 RUB");

        for (String str : price) {
            System.out.println(str);
        }
    }
}