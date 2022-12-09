package mirea.practice.s21k0723.format.task2;

import java.text.NumberFormat;
import java.util.Locale;

public class Converter {
    String codeLang;
    String codeLand;
    double course;

    public Converter(String codeLang, String codeLand, double course) {
        this.codeLang = codeLang;
        this.codeLand = codeLand;
        this.course = course;
    }

    public Converter() {
        //
    }

    public String getCodeLang() {
        return codeLang;
    }

    public void setCodeLang(String codeLang) {
        this.codeLang = codeLang;
    }

    public String getCodeLand() {
        return codeLand;
    }

    public void setCodeLand(String codeLand) {
        this.codeLand = codeLand;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public String converter(String codeLang, String codeLand, Double course, float sumBasket) {
        Locale locale = new Locale(codeLang, codeLand); //определяем локализацию
        NumberFormat format = NumberFormat.getCurrencyInstance(locale); //определяем форматировщик
        return "Amount in " + locale.getISO3Country() + " " + format.format(course * sumBasket);
    }

    @Override
    public String toString() {
        return "Converter{"
                +
                "kodLang='" + codeLang + '\''
                +
                ", kodLand='" + codeLand + '\''
                +
                ", course=" + course
                +
                '}';
    }
}