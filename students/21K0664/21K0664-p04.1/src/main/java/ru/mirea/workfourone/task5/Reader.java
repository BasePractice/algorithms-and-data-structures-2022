package ru.mirea.workfourone.task5;

import java.util.Arrays;

public class Reader {
    private String fullName;
    private int readerTicketNumber;
    private String faculty;
    private String dateBirth;
    private String telephoneNumber;

    Reader() {
    }

    Reader(String fullName, int readerTicketNumber, String faculty, String dateBirth, String telephoneNumber) {
        this.fullName = fullName;
        this.readerTicketNumber = readerTicketNumber;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.telephoneNumber = telephoneNumber;
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
