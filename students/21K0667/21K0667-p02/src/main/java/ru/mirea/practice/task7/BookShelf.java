package ru.mirea.practice.task7;

public class BookShelf {
    private Book[] shelf = new Book[5];

    public int maxYear() {
        int max = Integer.MIN_VALUE;
        for (Book someBook : shelf) {
            if (someBook.getYear() > max) {
                max = someBook.getYear();
            }
        }
        return max;
    }

    public int minYear() {
        int min = Integer.MAX_VALUE;

        for (Book someBook : shelf) {
            if (someBook.getYear() < min) {
                min = someBook.getYear();
            }
        }
        return min;
    }

    public void sort() {
        for (int i = 0; i < 5; i++) {
            Book x = shelf[i];
            int j = i - 1;
            while (j >= 0 && x.getYear() < shelf[j].getYear()) {
                shelf[j + 1] = shelf[j];
                j--;
            }
            shelf[j + 1] = x;

        }


    }

}

