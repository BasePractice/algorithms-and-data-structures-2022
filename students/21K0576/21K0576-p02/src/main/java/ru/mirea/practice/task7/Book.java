package ru.mirea.practice.task7;

public class Book {
    Book() {
        author = "";
        title = "";
        year = 2022;
    }

    Book(String title, String author, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{"
                + "author='" + author + '\''
                + ", title='" + title + '\''
                + ", year=" + year
                + '}';
    }

    String author;
    String title;
    int year;
}
