package ru.mirea.practice.task3;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Tester {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR,2003);
            calendar.set(Calendar.MONTH,3);
            calendar.set(Calendar.DAY_OF_MONTH,14);
            calendar.set(Calendar.HOUR_OF_DAY,6);
            System.out.println("Enter date format(short,middle,long):");
            String string = sc.nextLine();
            SimpleDateFormat format = new SimpleDateFormat();
            if ("short".equals(string) || "Short".equals(string)) {
                format.applyPattern("E, y-M-d ");
            }
            if ("middle".equals(string) || "Middle".equals(string)) {
                format.applyPattern("EE, y-M-d 'at' hh:mm:ss");
            }
            if ("long".equals(string) || "Long".equals(string)) {
                format.applyPattern("EEEE,d MMMM yyyy 'at' h:m:s a z");
            }
            Student student = new Student("Borya Invoke", "КВБО-02-21",2,"ИВТ",3.5,calendar.getTime());
            student.setFormat(format);
            System.out.println(student);
        }
    }
}
