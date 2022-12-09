package ru.mirea.practice.s21k0706.p6789;

public class Book implements Printable {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Книга " + title + "\nАвтор " + author + "\n");
    }
}

