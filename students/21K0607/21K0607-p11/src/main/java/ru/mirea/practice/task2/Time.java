package ru.mirea.practice.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Time {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Введите дату в формате : YYYY-MM-DD HH:MM:SS ");
            String string = in.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = format.parse(string);
            System.out.println("дата " + date);
            Date curr = new Date();
            System.out.println("текущая " + curr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
