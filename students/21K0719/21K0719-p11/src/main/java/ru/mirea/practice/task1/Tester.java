package ru.mirea.practice.task1;

import java.util.Date;
import java.util.Calendar;

public abstract class Tester {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2022);
        cal.set(Calendar.DAY_OF_MONTH, 10);
        cal.set(Calendar.HOUR_OF_DAY, 12);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);

        Status status = new Status("Bogdan Melnik", cal.getTime());
        status.setEnd(new Date());

        System.out.println(status);
    }
}
