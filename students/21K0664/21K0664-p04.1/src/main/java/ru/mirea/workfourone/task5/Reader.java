package ru.mirea.workfourone.task5;

import java.util.Arrays;

public class Reader {
    private String fullName;

    Reader(String fullName) {
        this.fullName = fullName;
    }

    public void takeBook(int amountOfBooks) {
        System.out.println(this.fullName + " взял " + amountOfBooks + " книги");
    }

    public void takeBook(String... bookTitles) {
        System.out.println(this.fullName + " взял книги: " + Arrays.toString(bookTitles));
    }

    public void takeBook(Book... bookTitles) {
        System.out.println(this.fullName + " взял книги: " + Arrays.toString(bookTitles));
    }

    public void returnBook(int amountOfBooks) {
        System.out.println(this.fullName + " вернул " + amountOfBooks + " книги");
    }

    public void returnBook(String... bookTitles) {
        System.out.println(this.fullName + " взял книги: " + Arrays.toString(bookTitles));
    }

    public void returnBook(Book... bookTitles) {
        System.out.println(this.fullName + " взял книги: " + Arrays.toString(bookTitles));
    }
}
