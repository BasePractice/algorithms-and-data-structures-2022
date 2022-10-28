package ru.mirea.practice.solutiontask7;

public class BookShelf {
    private final Book[] books;
    private final int count;

    public BookShelf(Book[] books, int count) {
        this.books = books;
        this.count = count;
    }

    public Book getYearlyBook() {
        Book temp;
        if (this.count > 1) {
            temp = this.books[0];
        } else {
            return this.books[0];
        }
        for (int i = 1; i < this.count; i++) {
            if (temp.getYear() < this.books[i].getYear()) {
                temp = this.books[i];
            }
        }
        return temp;
    }

    public Book getOlderBook() {
        Book temp;
        if (this.count > 1) {
            temp = this.books[0];
        } else {
            return this.books[0];
        }
        for (int i = 1; i < this.count; i++) {
            if (temp.getYear() > this.books[i].getYear()) {
                temp = this.books[i];
            }
        }
        return temp;
    }

    public void sortBooks() {
        for (int i = 0; i < this.count; i++) {
            for (int j = 0; j < this.count - 1; j++) {
                if (this.books[j].getYear() > this.books[j + 1].getYear()) {
                    Book temp = this.books[j + 1];
                    this.books[j + 1] = this.books[j];
                    this.books[j] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < this.count; i++) {
            temp.append("------").append(i + 1).append("------");
            temp.append(this.books[i].toString()).append('\n');
        }
        return temp.toString();
    }
}
