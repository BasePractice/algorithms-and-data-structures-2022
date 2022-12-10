package ru.mirea.practice.s21k0627.task1;

import java.util.Calendar;
import java.util.Date;

public abstract class Test {
    public static void main(String[] args) {
        Information info = new Information(new Date(122, Calendar.SEPTEMBER, 01, 9, 0), "Квашнина Д.О.");
        info.setPassDate(new Date());
        System.out.println(info.toString());
    }
}
