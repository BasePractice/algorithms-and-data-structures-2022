package ru.mirea.practice.subchapter.task5;

public class Reader {
    private String name;
    private int numB;
    private String fac;
    private int pnum;
    private String birthdate;

    Reader(int numB, int pnum, String name, String fac, String birthdate) {
        this.birthdate = birthdate;
        this.fac = fac;
        this.name = name;
        this.numB = numB;
        this.pnum = pnum;
    }

    public Reader() {
        this.name = "vova";
    }

    public void takeBook(int books) {
        System.out.println(name + " взял " + books + " книг(и/у).");
    }

    public void takeBook(String[] arr) {
        System.out.println(name + " взял книги: ");
        for (String s : arr) {
            System.out.print("-" + s);
        }
    }

    public void takeBook(Book[] arr) {
        System.out.println(name + " взял книги: ");
        for (Book s : arr) {
            System.out.println("-" + s.getName());
        }
    }

    public void returnBook(int books) {
        if (books > this.numB) {
            System.out.println(name + " принес " + (books - this.numB) + " книги");
        } else {
            System.out.println(name + " вернул " + books + " книги");
        }
        this.numB -= books;
    }

    @Override
    public String toString() {
        return this.name + " " + this.numB + " " + this.fac + " " + this.pnum + " " + this.birthdate;
    }
}
