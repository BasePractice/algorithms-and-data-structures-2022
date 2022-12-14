package ru.mirea.practice.task7;

public class Book {
    private int year;
    private String author;
    private String name;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(String author, int year, String name) {
        this.author = author;
        this.name = name;
        this.year = year;
    }
}
