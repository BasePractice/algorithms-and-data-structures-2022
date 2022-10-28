package ru.mirea.practice.s21k0647.zad5;

import java.util.ArrayList;
import java.util.List;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        List<Reader> readers = new ArrayList<>();
        readers.add(new Reader("Ivanov Ivan Ivanovich", 217234, "III", "11.03.2000", "89000000000"));
        readers.add(new Reader("Mihailov Mihail Mihailovich", 222132, "IT", "13.09.2002", "89000000031"));
        readers.add(new Reader("Petrov Ivan Ivanovich", 312741, "RKB", "23.11.2001", "89000355401"));
        Book[] books = {new Book("Tolstoy", "Voyna i mir"), new Book("Dostoyevskiy", "Prestuplenie i nakazanie")};
        readers.get(0).takeBook(books);
        readers.get(0).returnBook(books[0]);
    }
}
