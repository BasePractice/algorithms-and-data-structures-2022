package ru.mirea.practice.ex7;

import java.util.Arrays;

public class BookShelf {
    private Book[] books;
    private int quantity;

    public BookShelf(Book[] books) {
        this.books = books;
        quantity = books.length;
    }

    public Book newest() {
        Book newestBook = books[0];
        for (int i=1;i<quantity;i++) {
            if (books[i].getYear() > newestBook.getYear()) {
                newestBook = books[i];
            }
        }
        return newestBook;
    }

    public Book oldest() {
        Book oldestBook = books[0];
        for (int i=1;i<quantity;i++) {
            if (books[i].getYear() < oldestBook.getYear()) {
                oldestBook = books[i];
            }
        }
        return oldestBook;
    }

    public void sort() {
        Book tempBook;
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i=0;i<quantity-1;i++) {
                if (books[i].getYear() > books[i+1].getYear()) {
                    tempBook = books[i];
                    books[i] = books[i+1];
                    books[i+1] = tempBook;
                    changed = true;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + Arrays.toString(books) +
                ", quantity=" + quantity +
                '}';
    }
}
