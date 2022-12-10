package ru.mirea.practice.task7and8;

public abstract class Tester {
    public static void main(String[] args) {
        Printable[] print = {new Magazine("Playboy"),
            new Book("Fight Club"),
            new Magazine("GQ")};

        Magazine.printMagazines(print);
        System.out.println();
        Book.printBooks(print);
    }
}
