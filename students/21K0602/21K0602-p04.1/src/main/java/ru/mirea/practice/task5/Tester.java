package ru.mirea.practice.task5;

public abstract class Tester {
    public static void main(String[] args) {
        Reader reader = new Reader("Денис", "КВБО-03-21", "01.06.2003");
        System.out.println(reader.takeBook("Незнайка на луне", "Колобок"));
        Book[] books = {new Book("Толстой", "Война и мир"), new Book("Достоевский", "Преступление и наказание")};
        System.out.println(reader.takeBook(books));
        System.out.println(reader.returnBook(books));

    }
}
