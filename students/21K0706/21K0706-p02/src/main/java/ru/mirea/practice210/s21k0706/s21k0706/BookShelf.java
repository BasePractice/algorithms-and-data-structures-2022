package ru.mirea.practice210.s21k0706.s21k0706;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private List<Book> books = new ArrayList<>();
    private int n;

    public BookShelf(int n) {
        this.n = n;
    }

    public String less() {
        Book a = new Book("","",2030,1,2);
        for (int i = 0; i < n; ++i) {
            if (books.get(i).getWritingyear() < a.getWritingyear()) {
                a = books.get(i);
            }
        }
        return a.getAuthor() + "\t" + a.getTitle() + "\t" + a.getWritingyear()
                + "\t" + a.getPublicationyear() + "\t" + a.getCirculation();
    }

    public String more() {
        Book a = new Book("","",0,1,2);
        for (int i = 0; i < n; ++i) {
            if (books.get(i).getWritingyear() >= a.getWritingyear()) {
                a = books.get(i);
            }
        }
        return a.getAuthor() + "\t" + a.getTitle() + "\t" + a.getWritingyear()
                + "\t" + a.getPublicationyear() + "\t" + a.getCirculation();
    }

    public void add(Book a) {
        books.add(a);
    }
}
