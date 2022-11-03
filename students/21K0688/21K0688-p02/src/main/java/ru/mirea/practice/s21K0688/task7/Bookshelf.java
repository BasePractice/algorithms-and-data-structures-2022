package ru.mirea.practice.s21K0688.task7;

public class Bookshelf {
    private static final int N = 3;
    private Book[] arrOfBooks = new Book[N];

    static Book earlyYear(Book[] arrOfBooks) {
        int min = Integer.MAX_VALUE;
        Book temp = new Book(" ", 1, " ");
        for (int i = 0; i < arrOfBooks.length; i++) {
            if (arrOfBooks[i].getYear() < min) {
                min = arrOfBooks[i].getYear();
                temp.setYear(arrOfBooks[i].getYear());
                temp.setName(arrOfBooks[i].getName());
                temp.setAuthor(arrOfBooks[i].getAuthor());
            }
        }
        return temp;
    }

    static Book lastYear(Book[] arrOfBooks) {
        int max = Integer.MIN_VALUE;
        Book temp = new Book(" ", 1, " ");
        for (int i = 0; i < arrOfBooks.length; i++) {
            if (arrOfBooks[i].getYear() > max) {
                max = arrOfBooks[i].getYear();
                temp.setYear(arrOfBooks[i].getYear());
                temp.setName(arrOfBooks[i].getName());
                temp.setAuthor(arrOfBooks[i].getAuthor());
            }
        }
        return temp;
    }

    static void increasing(Book[] arrOfBooks) {
        Book temp = new Book(" ", 1, " ");
        for (int i = 0; i < arrOfBooks.length; i++) {
            for (int j = 0; j < arrOfBooks.length; j++) {
                if (arrOfBooks[j].getYear() > arrOfBooks[i].getYear()) {
                    temp = arrOfBooks[i];
                    arrOfBooks[i] = arrOfBooks[j];
                    arrOfBooks[j] = temp;
                }
            }
        }
    }
}
