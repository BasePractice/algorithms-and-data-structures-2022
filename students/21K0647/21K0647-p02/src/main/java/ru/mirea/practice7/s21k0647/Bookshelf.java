package ru.mirea.practice7.s21k0647;

import java.util.ArrayList;

public class Bookshelf {
    int n;
    ArrayList<Book> bB = new ArrayList<>();

    public Bookshelf(int n) {
        this.n = n;
    }

    public void bookshelfAdd(Book a) {
        bB.add(a);
    }

    public String old() {
        Book a = new Book("", "", 2023);
        for (int i = 0; i < n; ++i) {
            if (bB.get(i).year < a.year) {
                a = bB.get(i);
            }
        }
        return "Author: " + a.author + "\tTitle: " + a.title + "\tYear: " + a.year;
    }

    public String young() {
        Book a = new Book("", "", -2023);
        for (int i = 0; i < n; ++i) {
            if (bB.get(i).year > a.year) {
                a = bB.get(i);
            }
        }
        return "Author: " + a.author + "\tTitle: " + a.title + "\tYear: " + a.year;
    }
}
