package mirea.practice.s21k0723.format.task1;

import java.text.NumberFormat;
import java.util.Locale;

public class Conventer {
    double s;
    String from;
    String inlang;
    String inland;

    double course;

    Conventer(double number, String from, String inlang, String inland, double course) {
        this.s = number;
        this.from = from;
        this.inlang = inlang;
        this.inland = inland;
        this.course = course;
    }

    public String formated() {
        Locale.setDefault(new Locale(inlang, inland));
        double v = s;
        v = v * course;
        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance();
        return numberFormat1.format(v);
    }



    public String toString() {
        return "Translation " 
                + s 
                + "\nfrom " 
                + from 
                + " in " 
                + inlang 
                + "\nOutput " 
                + formated();
    }

}