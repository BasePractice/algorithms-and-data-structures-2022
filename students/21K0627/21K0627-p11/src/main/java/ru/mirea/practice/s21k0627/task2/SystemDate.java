package ru.mirea.practice.s21k0627.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public abstract class SystemDate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter date in next format: yyyy-MM-dd");
            String str = sc.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = format.parse(str);
            System.out.println("Your date: " + date);
            System.out.println("System date: " + new Date());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
