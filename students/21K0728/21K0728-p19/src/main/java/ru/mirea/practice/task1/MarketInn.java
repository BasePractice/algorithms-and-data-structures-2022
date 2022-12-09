package ru.mirea.practice.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MarketInn {
    public boolean checkInn(String inn) {
        Pattern pat = Pattern.compile("\\d{12}");
        Matcher match = pat.matcher(inn);
        return match.matches();
    }
}
