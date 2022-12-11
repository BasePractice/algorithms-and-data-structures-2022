package ru.mirea.practice.task1;

import java.util.Date;

public abstract class Test {
    public static void main(String[] args) throws InterruptedException {
        Dev developer = new Dev("Железняков Родион", new Date());
        Thread.sleep(1000);
        developer.setEndDate(new Date());
        System.out.println(developer.toString());
    }
}
