package ru.mirea.practice.task7;

public class BookShelf {
    private Book[] arr;

    private int num;

    public BookShelf(Book[] arr) {
        this.num = arr.length;

        this.arr = arr;
    }

    public Book min() {
        int min = arr[0].getYear();

        int j = -1;

        for (int i = 0; i < num; i++) {
            if (arr[i].getYear() <= min) {
                min = arr[i].getYear();
                j = i;
            }
        }

        return arr[j];
    }

    public Book max() {
        int max = arr[0].getYear();

        int j = -1;

        for (int i = 0; i < num; i++) {
            if (arr[i].getYear() >= max) {
                max = arr[i].getYear();
                j = i;
            }
        }

        return arr[j];
    }

    public void toSort() {
        bookSort(this.arr, 0, this.num - 1);
    }

    public static void bookSort(Book[] source, int left, int right) {
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            bookSort(source, left, delimiter - 1);
            bookSort(source, delimiter, right);
        }
        Book[] buffer = new Book[right - left + 1];
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            if (delimiter > right || source[cursor].getYear() <= source[delimiter].getYear()) {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, source, left, buffer.length);
    }

    @Override
    public String toString() {
        String s = "ToString: ";

        for (int i = 0; i < arr.length; i++) {
            s += this.arr[i].toString() + "; ";
        }

        return s;
    }
}
