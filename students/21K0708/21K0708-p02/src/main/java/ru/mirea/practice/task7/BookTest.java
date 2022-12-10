package ru.mirea.practice.task7;

public abstract class BookTest {
    public static void main(String[] args) {
        Book book2 = new Book("Pushkin", "Capitain's daughter", 1836);
        Book book3 = new Book("Sapkovskiy", "Last wish", 1993);
        Book book4 = new Book("Obruchev", "Sannikov land", 1924);

        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(book2);
        bookShelf.addBook(book3);
        bookShelf.addBook(book4);

        System.out.println(bookShelf.getNumber());
        System.out.println(bookShelf.getEarliestBook());
        System.out.println(bookShelf.getLatestBook());

        bookShelf.bookSort();
        System.out.println(bookShelf);
    }
}
