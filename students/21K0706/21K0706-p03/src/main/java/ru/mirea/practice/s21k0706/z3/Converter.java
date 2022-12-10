package ru.mirea.practice.s21k0706.z3;

import java.text.NumberFormat;
import java.util.Locale;

public class Converter {
    String s;
    String from;
    String one;
    String two;
    String course;

    Converter(String s, String from, String one, String two, String cource) {
        this.s = s;
        this.from = from;
        this.one = one;
        this.two = two;
        this.course = cource;
    }

    public String changed() {
        double n = Double.parseDouble(s);
        Locale.setDefault(new Locale(one, two));
        double n1 = Double.parseDouble(course);
        n = n * n1;
        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance();
        return numberFormat1.format(n);
    }

    @Override
    public String toString() {
        return "Translation " + s + "\nfrom " + from + " in " + one + "\nOutput " + changed();
    }

}
