package ru.mirea.practice.task7to8;

public class Book implements Printable {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + name);
    }

    public static void printBooks(Printable[] printables) {
        for (Printable printable : printables) {
            printable.print();
        }
    }
}
