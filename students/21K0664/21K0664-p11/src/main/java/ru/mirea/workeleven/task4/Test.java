package ru.mirea.workeleven.task4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        try {
            System.out.print("Введите год: ");
            int year = in.nextInt();
            cal.set(Calendar.YEAR, year);

            System.out.print("Введите месяц: ");
            int month = in.nextInt();
            cal.set(Calendar.MONTH, month);

            System.out.print("Введите день: ");
            int day = in.nextInt();
            cal.set(Calendar.DAY_OF_MONTH, day);

            System.out.println(sdf.format(cal.getTime()));

            long startTime = System.currentTimeMillis();
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println(estimatedTime);
        } catch (InputMismatchException e) {
            System.out.println("Error");
            in.nextInt();
        } finally {
            in.close();
        }
    }
}
