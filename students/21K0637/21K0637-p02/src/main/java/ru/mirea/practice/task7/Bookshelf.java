package ru.mirea.practice.task7;

import java.util.Arrays;

public class Bookshelf {
    private Book[] arr;
    private int num;

    public Bookshelf(Book[] arr) {
        this.num = arr.length;
        this.arr = arr;
    }

    public Book min() {
        int min = arr[0].getPublicationDate();
        int j = -1;

        for (int i = 0; i < num; i++) {
            if (arr[i].getPublicationDate() <= min) {
                min = arr[i].getPublicationDate();
                j = i;
            }
        }

        return arr[j];
    }

    public Book max() {
        int max = arr[0].getPublicationDate();
        int j = -1;

        for (int i = 0; i < num; i++) {
            if (arr[i].getPublicationDate() >= max) {
                max = arr[i].getPublicationDate();
                j = i;
            }
        }

        return arr[j];
    }

    public void toSort() {
        Arrays.sort(this.arr, (o1, o2) -> o1.getPublicationDate() - o2.getPublicationDate());
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("ToString:\n");

        for (Book book : arr) {
            s.append(book.toString()).append(";\n");
        }

        return s.toString();
    }
}
