package ru.mirea.practice.formatting.task1;

import java.text.NumberFormat;
import java.util.Locale;

public class Convertor {
    private static double CHN = 7.25;
    private static double JAP = 146.47;
    private static double EUR = 0.99265;
    private static double USD = 1.0;

    public static String convert(String cur, String fut, double val) {
        NumberFormat numberFormat=NumberFormat.getInstance();
        switch (cur) {
            case "CHN":
                val /= CHN;
                break;
            case "JAP":
                val /= JAP;
                break;
            case "EUR":
                val /= EUR;
                break;
            case "USD":
                val /= USD;
                break;
        }
        switch (fut) {
            case "CHN":
                val *= CHN;
                numberFormat=NumberFormat.getCurrencyInstance(Locale.CHINA);
                break;
            case "JAP":
                val *= JAP;
                numberFormat=NumberFormat.getCurrencyInstance(Locale.JAPAN);
                break;
            case "EUR":
                val *= EUR;
                numberFormat=NumberFormat.getCurrencyInstance(Locale.FRANCE);
                break;
            case "USD":
                val *= USD;
                numberFormat=NumberFormat.getCurrencyInstance(Locale.US);
                break;
            }
        return numberFormat.format(val);
    }

    public static void main(String[] args) {
        Convertor conv = new Convertor();
        String cur="JAP", fut="CHN";
        double val = 100;
        System.out.println(conv.convert(cur, fut, val));
    }
}
