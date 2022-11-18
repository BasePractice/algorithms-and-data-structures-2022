package ru.mirea.practice.s21k0709.format.s21k0709.task1;

import java.text.NumberFormat;
import java.util.Locale;

public class Converter {
    double s;
    String from;
    String inlang;
    String inland;

    double course;

    Converter(double s, String from, String inlang, String inland, double cource) {
        this.s = s;
        this.from = from;
        this.inlang = inlang;
        this.inland = inland;
        this.course = cource;
    }

    public String formated() {
        double coef = s;
        Locale.setDefault(new Locale(inlang, inland));
        coef = coef * course;
        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance();
        return numberFormat1.format(coef);
    }



    public String toString() {
        return "Translation " + s + "\nfrom " + from + " in " + inlang + "\nOutput " + formated();
    }

}