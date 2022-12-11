package ru.mirea.practice.task5;

import java.time.Year;

public class Reader {
    private String fullName;
    private String numberOfCard;
    private String faculty;
    private Year dob;
    private String phoneNumber;

    public Reader(String fullName, String numberOfCard, String faculty, Year dob, String phoneNumber) {
        this.fullName = fullName;
        this.numberOfCard = numberOfCard;
        this.faculty = faculty;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
    }

    public String takeBook(int count) {
        return fullName + " взял " + count + " книги.";
    }

    public void takeBook(String... count) {
        System.out.print(fullName + " взял книги: ");
        for (String book : count) {
            System.out.print(book + "; ");
        }
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (Book book : books) {
            System.out.print(book + "; ");
        }
    }

    public String returnBook(int count) {
        return fullName + " вернул " + count + " книги.";
    }

    public void returnBook(String... count) {
        System.out.print(fullName + " вернул книги: ");
        for (String book : count) {
            System.out.print(book + "; ");
        }
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (Book book : books) {
            System.out.print(book + "; ");
        }
    }


    @Override
    public String toString() {
        return fullName + " " + numberOfCard + " " + faculty + " " + dob + " " + phoneNumber;
    }


}
