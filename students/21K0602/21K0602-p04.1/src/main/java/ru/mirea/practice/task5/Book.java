package ru.mirea.practice.task5;

public class Book {
    private final String author;
    private final String name;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
