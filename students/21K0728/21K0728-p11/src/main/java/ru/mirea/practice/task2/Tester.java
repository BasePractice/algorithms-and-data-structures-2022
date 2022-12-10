package ru.mirea.practice.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) throws ParseException {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Input date (yyyy-mm-dd): ");
            String strDate = scan.nextLine();
            SimpleDateFormat sample = new SimpleDateFormat("yyyy-mm-dd");
            Date dt = sample.parse(strDate);
            SimpleDateFormat smd = new SimpleDateFormat("mm-dd-yyyy");
            System.out.println("Your date is: " + smd.format(dt).toUpperCase(Locale.ENGLISH));

            Date today = new Date();
            System.out.println("Today date is: " + smd.format(today));
        }
    }
}
