package ru.mirea.practice.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Parser {

    public static List<String> parse(String str) {
        Pattern compile = Pattern.compile("\\b(([1-9][0-9]*\\.?)|(0\\.))[0-9]+\\s*?((RUB)|(EU)|(USD))\\b");
        Matcher matcher = compile.matcher(str);
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(matcher.group());

        }
        System.out.println(Arrays.toString(list.toArray()));
        return list;

    }

    public static void main(String[] args) {
        List<String> list = parse("1223243.232 RUB, 23 ru, 01214 EU," + " 0.12324 RU, 121..10 USD, 10.98 USD, efsd23 USDr3232");
        System.out.println(Arrays.toString(list.toArray()));
    }
}
