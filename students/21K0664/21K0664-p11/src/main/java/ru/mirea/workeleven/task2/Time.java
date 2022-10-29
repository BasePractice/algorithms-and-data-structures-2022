package ru.mirea.workeleven.task2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату в виде гггг-мм-дд: ");
        String strdate = sc.nextLine();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        Date date = s.parse(strdate);
        sc.close();

        SimpleDateFormat smd = new SimpleDateFormat("MMM-dd-yyyy", Locale.ENGLISH);
        System.out.println("Ваша дата: " + smd.format(date).toUpperCase());

        Date now = new Date();
        System.out.println("Сегодняйшая дата: " + now);

    }
}
