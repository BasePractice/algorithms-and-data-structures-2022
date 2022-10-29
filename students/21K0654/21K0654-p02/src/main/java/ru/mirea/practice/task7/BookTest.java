package ru.mirea.practice.task7;

public class BookTest {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        for (int i = 0; i < 10; i++) {
            books[i] = new Book((int) (Math.random() * 100));
        }
        BookShelf bookShelf = new BookShelf(books);
        System.out.println(bookShelf.toString());
        System.out.println("Max, Min:" + '\n' + bookShelf.max().toString() + '\n' + bookShelf.min().toString());
        bookShelf.toSort();
        System.out.println(bookShelf.toString());


    }
}
