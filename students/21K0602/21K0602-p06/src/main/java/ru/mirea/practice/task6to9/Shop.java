package ru.mirea.practice.task6to9;

import ru.mirea.practice.task4.Computer;

public class Shop implements Printable {
    private final Book[] books;
    private final Computer[] computers;

    public Shop(Book[] books, Computer[] computers) {
        this.books = books;
        this.computers = computers;
    }

    public Book[] getBooks() {
        return books;
    }

    public Computer[] getComputers() {
        return computers;
    }

    @Override
    public void print() {
        System.out.println("Books catalog: ");
        for (Book book : books) {
            book.print();
        }
        System.out.println("Computers catalog: ");
        for (Computer computer : computers) {
            System.out.println(computer.toString());
        }
    }
}
