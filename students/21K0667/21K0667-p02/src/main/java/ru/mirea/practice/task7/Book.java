package ru.mirea.practice.task7;

public class Book {
    private String author;
    private int year;
    private String name;

    public Book() {
        this.author = "None";
        this.year = 0;
        this.name = "None";
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(String author, int year, String name) {
        this.author = author;
        this.year = year;
        this.name = name;
    }

    @Override
    public String toString() {

        return "Author: " + author + ", Year:  " + year + ", Name: " + name;
    }

}

