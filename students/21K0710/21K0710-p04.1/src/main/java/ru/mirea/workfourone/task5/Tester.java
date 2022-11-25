package ru.mirea.workfourone.task5;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {
        Book b1 = new Book("Энциклопедия", "Петя");
        Book b2 = new Book("Словарь", "Вася");
        Reader r1 = new Reader("Петров В.В.", "216487", "Психология", "13.02.2002", "89634860558");
        r1.takeBook(b1, b2);
        r1.returnBook("Энциклопедия", "Словарь");
        r1.takeBook(3);
    }
}
