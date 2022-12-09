package ru.mirea.practice.s21k0706.p6789;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        Printable[] printables = new Printable[2];
        printables[0] = new Book("Mumu", "Turgenev");
        printables[1] = new Shop("ABC", "10.11.2022");
        for (Printable x: printables) {
            x.print();
        }

    }
}
