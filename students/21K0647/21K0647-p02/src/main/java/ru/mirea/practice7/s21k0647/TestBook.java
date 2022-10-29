package ru.mirea.practice7.s21k0647;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Tolstoy", "Anna Karenina", 1873);
        Book b2 = new Book("Hemenguei", "for whom the bell tolls", 1940);
        Book b3 = new Book("Pushkin", "Eugene Onegin", 1831);
        Bookshelf shelf = new Bookshelf(3);
        shelf.bookshelfAdd(b1);
        shelf.bookshelfAdd(b2);
        shelf.bookshelfAdd(b3);
        System.out.println(shelf.old());
        System.out.println(shelf.young());
    }
}
