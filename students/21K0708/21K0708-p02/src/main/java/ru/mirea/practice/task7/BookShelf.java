package ru.mirea.practice.task7;

import java.util.List;

public class BookShelf {
    private List<Book> books;
    private int number = 0;

    public int getNumber() {
        return number;
    }

    public void addBook(String author, String title, int yearOfWriting) {
        books.add(new Book(author, title, yearOfWriting));
        number++;
    }

    public void addBook(Book book) {
        books.add(book);
        number++;
    }

    public void deleteBook(String author, String title, int yearOfWriting) {
        for (int i = 0; i < number; i++) {
            if (books.get(i).getAuthor().equals(author) && books.get(i).getTitle().equals(title)) {
                books.remove(i);
            }
        }
        number--;
    }

    public void deleteBook(int index) {
        books.remove(index);
        number--;
    }

    public boolean searchBook(String author, String title, int yearOfWriting) {
        for (int i = 0; i < number; i++) {
            if (books.get(i).getAuthor().equals(author) && books.get(i).getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public Book getLatestBook() {
        int max = 0;
        Book latestBook = new Book();
        for (int i = 0; i < number; i++) {
            if (books.get(i).getYearOfWriting() >= max) {
                latestBook = books.get(i);
                max = latestBook.getYearOfWriting();
            }
        }
        return latestBook;
    }

    public Book getEarliestBook() {
        int min = books.get(0).getYearOfWriting();
        Book earliestBook = new Book();
        for (int i = 0; i < number; i++) {
            if (books.get(i).getYearOfWriting() <= min) {
                earliestBook = books.get(i);
            }
        }
        return earliestBook;
    }

    public void bookSort() {
        for (int i = 1; i < number; i++) {
            for (int j = 0; j < i; j++) {
                if (books.get(j).getYearOfWriting() > books.get(j + 1).getYearOfWriting()) {
                    Book supportBook = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, supportBook);
                }
            }
        }
    }

    public String toString() {
        return books.toString();
    }
}
