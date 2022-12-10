package ru.mirea.practice.task7and8;

public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Book's name is: " + name);
    }

    public static void printBooks(Printable[] prints) {
        for (Printable print : prints) {
            if (print instanceof Book) {
                print.print();
            }
        }
    }
}
