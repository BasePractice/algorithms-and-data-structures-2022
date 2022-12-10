package ru.mirea.practice.task1;

/* Дан текст со списками цен. Извлечь из него цены в USD, RUВ, EU.
a) пример правильных выражений: 25.98 USD.
b) пример неправильных выражений: 44 ERR, 0.004 EU. */

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Task1 {

    private Task1() {
    }

    public static List<String> parse(String strToParse) {

        Matcher matcher = Pattern.compile("\\b(([1-9]\\d*\\.?)|(0\\.))\\d+\\s*?((RUB)|(EU)|(USD))\\b").matcher(strToParse);

        List<String> parsedList = new ArrayList<>();
        while (matcher.find()) {
            parsedList.add(matcher.group());
        }

        return parsedList;
    }

    public static void main(String[] args) {

        List<String> arrayList = parse("33.3 RUB, 99,0 RU, 0123 EU 0.001 USD");

        arrayList.forEach(System.out::println);
    }
}
