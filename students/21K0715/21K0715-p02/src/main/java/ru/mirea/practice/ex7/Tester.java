package ru.mirea.practice.ex7;

public class Tester {
    public static void main(String[] args) {
        Book b1 = new Book("Bulgakov","Master and Margarita",1928);
        Book b2 = new Book("Dostoevsky","Crime and punishment",1866);
        BookShelf bs = new BookShelf(new Book[]{b1, b2});

        System.out.println("oldest book: " + bs.oldest());
        System.out.println("newest book: " + bs.newest());

        System.out.println("unsorted: " + bs);
        bs.sort();
        System.out.println("sorted: " + bs);

    }
}
