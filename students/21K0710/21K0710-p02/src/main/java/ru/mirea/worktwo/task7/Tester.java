package ru.mirea.worktwo.task7;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(3);
        Book a = new Book("1", "1", 1);
        Book b = new Book("2", "2", 3);
        Book c = new Book("3", "3", 2);
        bookShelf.addBook(a);
        bookShelf.addBook(b);
        bookShelf.addBook(c);
        bookShelf.sortBooks();
        System.out.println(bookShelf.oldestBook());
        System.out.println(bookShelf.newestBook());
        System.out.println(bookShelf);
    }
}
