package ru.mirea.practice.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shop {
    public boolean check(String inn) {
        Pattern pat = Pattern.compile("\\d{12}");
        Matcher mat = pat.matcher(inn);
        return mat.matches();
    }
}
