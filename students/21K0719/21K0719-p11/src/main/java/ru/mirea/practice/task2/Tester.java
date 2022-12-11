package ru.mirea.practice.task2;

import java.util.Scanner;
import java.util.Calendar;

public abstract class Tester {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Calendar calendar = Calendar.getInstance();
            System.out.println("Enter year:");
            calendar.set(Calendar.YEAR,sc.nextInt());
            System.out.println("Enter month:");
            calendar.set(Calendar.MONTH,sc.nextInt());
            System.out.println("Enter day:");
            calendar.set(Calendar.DAY_OF_MONTH,sc.nextInt());
            System.out.println("Enter hour:");
            calendar.set(Calendar.HOUR_OF_DAY,sc.nextInt());
            System.out.println("Enter Minute:");
            calendar.set(Calendar.MINUTE,sc.nextInt());
            System.out.println("Enter second:");
            calendar.set(Calendar.SECOND,sc.nextInt());

            Calendar rightNow = Calendar.getInstance();

            if (calendar.compareTo(rightNow) == 1) {
                System.out.println("Your date is bigger");
            }
            if (calendar.compareTo(rightNow) == -1) {
                System.out.println("Your date is smaller");
            }
            if (calendar.compareTo(rightNow) == 0) {
                System.out.println("Your date is equal");
            }
        }
    }
}
