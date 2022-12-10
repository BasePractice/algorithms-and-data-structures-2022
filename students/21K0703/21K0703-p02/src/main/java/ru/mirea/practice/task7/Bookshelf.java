package ru.mirea.practice.task7;

abstract class Bookshelf {

    static Book earlyYear(Book[] arrOfBooks) {
        int min = Integer.MAX_VALUE;
        Book temp = new Book(" ", 1, " ");
        for (Book arrOfBook : arrOfBooks) {
            if (arrOfBook.getYear() < min) {
                min = arrOfBook.getYear();
                temp.setYear(arrOfBook.getYear());
                temp.setName(arrOfBook.getName());
                temp.setAuthor(arrOfBook.getAuthor());
            }
        }
        return temp;
    }

    static Book lastYear(Book[] arrOfBooks) {
        int max = Integer.MIN_VALUE;
        Book temp = new Book(" ", 1, " ");
        for (Book arrOfBook : arrOfBooks) {
            if (arrOfBook.getYear() > max) {
                max = arrOfBook.getYear();
                temp.setYear(arrOfBook.getYear());
                temp.setName(arrOfBook.getName());
                temp.setAuthor(arrOfBook.getAuthor());
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
