package ru.mirea.practice.s21k0647.formatstring.converter;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConverter {
    String s;
    String from;
    String inlang;
    String inland;
    String course;

    CurrencyConverter(String s, String from, String inlang, String inland, String cource) {
        this.s = s;
        this.from = from;
        this.inlang = inlang;
        this.inland = inland;
        this.course = cource;
    }

    public String formated() {
        double n = Double.parseDouble(s);
        Locale.setDefault(new Locale(inlang, inland));
        double n1 = Double.parseDouble(course);
        n = n * n1;
        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance();
        return numberFormat1.format(n);
    }



    public String toString() {
        return "Translation " + s + "\nfrom " + from + " in " + inlang + "\nOutput " + formated();
    }

}
