package ru.mirea.practice.task7to8;

public abstract class Tester {
    public static void main(String[] args) {
        Book.printBooks(new Book[]{new Book("Война и мир", "Толстой"),
            new Book("Преступление и наказание", "Достоевский")});
        Journal.printMagazines(new Journal[]{new Journal("nn"), new Journal("Truth")});
    }
}
