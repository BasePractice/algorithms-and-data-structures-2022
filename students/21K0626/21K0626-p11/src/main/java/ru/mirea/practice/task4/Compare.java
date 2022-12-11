package ru.mirea.practice.task4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public abstract class Compare {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Calendar calendar = new GregorianCalendar();
            System.out.print("Введите год: ");
            calendar.set(Calendar.YEAR, sc.nextInt());
            System.out.print("Введите месяц: ");
            calendar.set(Calendar.MONTH, sc.nextInt());
            System.out.print("Введите день: ");
            calendar.set(Calendar.DAY_OF_MONTH, sc.nextInt());
            System.out.print("Введите часы: ");
            calendar.set(Calendar.HOUR_OF_DAY, sc.nextInt());
            System.out.print("Введите минуты: ");
            calendar.set(Calendar.MINUTE, sc.nextInt());
            System.out.println(calendar.getTime());
        }
    }
}
