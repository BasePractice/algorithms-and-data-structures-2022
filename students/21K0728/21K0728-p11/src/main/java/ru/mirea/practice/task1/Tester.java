package ru.mirea.practice.task1;

import java.util.Calendar;
import java.util.Date;

public abstract class Tester {
    public static void main(String[] args) {
        Calendar clndr = Calendar.getInstance();
        clndr.set(Calendar.YEAR, 2022);
        clndr.set(Calendar.MONTH, Calendar.SEPTEMBER);
        clndr.set(Calendar.DAY_OF_MONTH, 2);
        Programmer progger = new Programmer("Senua The Meph", clndr.getTime());
        progger.setEnd(new Date());
        System.out.print(progger);
    }
}
