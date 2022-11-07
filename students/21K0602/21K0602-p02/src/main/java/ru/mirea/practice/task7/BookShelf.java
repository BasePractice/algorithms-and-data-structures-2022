package ru.mirea.practice.task7;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private final List<Book> bookShelf;

    public BookShelf() {
        bookShelf = new ArrayList<>(0);
    }

    public void addBook(Book book) {
        bookShelf.add(book);
    }

    public Book getMaxDateBook() {
        Book maxBook = new Book();
        for (Book book : bookShelf) {
            if(maxBook.getDate() < book.getDate()) {
                maxBook = book;
            }
        }
        return maxBook;
    }

    public Book getMinDateBook() {
        Book minBook = new Book(null, Integer.MAX_VALUE, null);

        for (Book book : bookShelf) {
            if(minBook.getDate() > book.getDate()) {
                minBook = book;
            }
        }
        return minBook;
    }

    public void sortBookShelf() {

        for (int left = 0; left < bookShelf.size(); left++) {
            Book value = bookShelf.get(left);
            int i = left - 1;
            for (; i >= 0; i--) {
                if(value.compareTo(bookShelf.get(i)) < 0) {

                    bookShelf.set(i + 1, bookShelf.get(i));
                }
                else {
                    break;
                }
            }
            bookShelf.set(i + 1, value);


        }
        System.out.println(bookShelf);
    }


}
