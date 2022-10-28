package ru.mirea.practice.task7;

abstract class BookTest {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        for (int i = 0; i < 5; i++) {
            books[i] = new Book();
        }
        for (int j = 0; j < 5; j++) {
            System.out.println(books[j].getAuthor());
        }
    }

}

