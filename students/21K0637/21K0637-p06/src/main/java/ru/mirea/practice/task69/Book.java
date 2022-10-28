package ru.mirea.practice.task69;

public class Book implements Printable {
    private final String name;
    private final String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("%s - %s\n", author, name);
    }
}
