package ru.mirea.practice.task69;

import java.util.Date;

public class Shop implements Printable {
    private final String name;
    private final Date date;

    public Shop(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public void print() {
        System.out.println(name + " от " + date);
    }
}
