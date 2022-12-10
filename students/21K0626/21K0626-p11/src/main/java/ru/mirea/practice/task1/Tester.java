package ru.mirea.practice.task1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Tester {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2022, 8, 15);
        Task task = new Task(calendar.getTime(),new Date(), "Kvasov Gleb Sergeevich");
        System.out.println(task);
    }
}
