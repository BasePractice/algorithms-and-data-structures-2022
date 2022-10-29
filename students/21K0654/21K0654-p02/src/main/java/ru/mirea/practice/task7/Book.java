package ru.mirea.practice.task7;

public class Book {
    private String author;

    private int year;

    private String title;

    public Book(int i) {
        this.year = i;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int compareYear(Book b1, Book b2) {
        return b1.getYear() - b2.getYear();
    }

    @Override
    public String toString() {
        return this.title + " " + this.year + " " + this.author;
    }
}
