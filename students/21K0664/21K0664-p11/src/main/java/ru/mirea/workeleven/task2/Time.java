package ru.mirea.workeleven.task2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

abstract class Time {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите дату в виде гггг-мм-дд: ");
            String strdate = sc.nextLine();
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
            Date date = s.parse(strdate);
            SimpleDateFormat smd = new SimpleDateFormat("MMM-dd-yyyy", Locale.ENGLISH);
            System.out.println("Ваша дата: " + smd.format(date).toUpperCase(Locale.ENGLISH));

            Date now = new Date();
            System.out.println("Сегодняйшая дата: " + now);
        } catch (InputMismatchException e) {
            System.out.println("Error");
            sc.nextInt();
        } finally {
            sc.close();
        }


    }
}
