package ru.mirea.practice.task69;

import java.util.Date;

public abstract class Tester {
    public static void main(String[] args) {
        Printable[] array = {new Book("Lorem", "Ipsum"),
            new Shop("Vestnik", new Date())};
        for (Printable printable : array) {
            printable.print();
        }
    }
}
