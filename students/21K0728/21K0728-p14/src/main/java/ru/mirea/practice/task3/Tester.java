package ru.mirea.practice.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Tester {
    public static void main(String[] args) {
        String str = "35.70 RUB, rrz, 234.3, 191.73 EU, 15 USD, thrash";
        Pattern pat = Pattern.compile("\\d+(|.\\d+) (RUB|USD|EU)");
        Matcher match = pat.matcher(str);

        while (match.find()) {
            System.out.println(match.group());
        }
    }
}
