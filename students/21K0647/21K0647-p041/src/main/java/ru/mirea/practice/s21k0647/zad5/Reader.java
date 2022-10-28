package ru.mirea.practice.s21k0647.zad5;

public class Reader {
    String fio;
    int number;
    String faculty;
    String birthdate;
    String telephone;

    Reader(String fio, int number, String faculty, String birthdate, String telephone) {
        this.fio = fio;
        this.number = number;
        this.faculty = faculty;
        this.birthdate = birthdate;
        this.telephone = telephone;
    }

    public void takeBook(int n) {
        System.out.println(fio + " взял " + n + " книг.");
        System.out.println();
    }

    public void takeBook(String... books) {
        System.out.println(fio + " взял : ");
        for (String x: books) {
            System.out.println(x);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(fio + " взял : ");
        for (Book x: books) {
            System.out.println(x.title);
        }
        System.out.println();
    }

    public void returnBook(int n) {
        System.out.println(fio + " вернул " + n + " книг.");
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(fio + " вернул : ");
        for (Book x: books) {
            System.out.println(x.title);
        }
        System.out.println();
    }

    public void returnBook(String... books) {
        System.out.println(fio + " вернул : ");
        for (String x: books) {
            System.out.println(x);
        }
        System.out.println();
    }

}
