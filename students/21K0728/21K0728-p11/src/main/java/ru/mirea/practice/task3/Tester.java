package ru.mirea.practice.task3;

import java.util.Calendar;

public abstract class Tester {
    public static void main(String[] args) {
        Calendar birthday = Calendar.getInstance();
        birthday.set(Calendar.YEAR, 1966);
        birthday.set(Calendar.MONTH, Calendar.MARCH);
        birthday.set(Calendar.DAY_OF_MONTH, 18);
        Student student = new Student("Jerry Cantrell", "Alice In Chains", 4, "GTR", 3.57, birthday.getTime());
        System.out.print(student);
    }
}
