package ru.mirea.practice.task7;

public abstract class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("d", 2, "n"));
        bookShelf.addBook(new Book("d", 1, "n"));
        bookShelf.addBook(new Book("d", 200, "n"));
        bookShelf.addBook(new Book("d", 20, "n"));
        System.out.println("Max date =" + bookShelf.getMaxDateBook());
        System.out.println("Min date =" + bookShelf.getMinDateBook());
        bookShelf.sortBookShelf();
    }
}
