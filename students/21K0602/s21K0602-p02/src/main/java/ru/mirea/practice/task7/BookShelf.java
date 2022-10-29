package ru.mirea.practice.task7;

import java.util.ArrayList;

public class BookShelf {
    private final ArrayList<Book> BookShelf;

    public BookShelf() {
        BookShelf = new ArrayList<>(0);
    }

    public void addBook(Book book) {
        BookShelf.add(book);
    }

    public Book getMaxDateBook() {
        Book maxBook = new Book();
        for (Book book : BookShelf) {
            if (maxBook.getDate() < book.getDate()) {
                maxBook = book;
            }
        }
        return maxBook;
    }

    public Book getMinDateBook() {
        Book minBook = new Book(null, Integer.MAX_VALUE, null);

        for (Book book : BookShelf) {
            if (minBook.getDate() > book.getDate()) {
                minBook = book;
            }
        }
        return minBook;
    }

    public void sortBookShelf() {

        for (int left = 0; left < BookShelf.size(); left++) {
            Book value = BookShelf.get(left);
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.compareTo(BookShelf.get(i)) < 0) {

                    BookShelf.set(i + 1, BookShelf.get(i));
                } else {
                    break;
                }
            }
            BookShelf.set(i + 1, value);


        }
        System.out.println(BookShelf);
    }


}
