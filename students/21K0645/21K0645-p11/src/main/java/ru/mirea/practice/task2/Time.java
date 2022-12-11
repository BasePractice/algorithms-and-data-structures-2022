package ru.mirea.practice.task2;

/* Приложение, сравнивающее текущую дату и дату, введенную
пользователем c текущим системным временем */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public final class Time {

    private Time() {
    }

    public static void main(String[] args) throws ParseException {

        try (Scanner in = new Scanner(System.in)) {

            System.out.println("Enter date in format : yyyy-MM-dd HH:mm:ss ");
            String string = in.nextLine();

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = formatter.parse(string);
            System.out.println("Your date : " + date);

            Date currentDate = new Date();
            System.out.println("Current date : " + currentDate);

        }

    }
}
