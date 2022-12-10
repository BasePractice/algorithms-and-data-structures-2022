package ru.mirea.practice.task7;

public class Book {
    private String author;
    private String title;
    private int yearOfWriting;

    public Book() {
        author = "";
        title = "";
        yearOfWriting = 0;
    }

    public Book(String author, String title, int yearOfWriting) {
        this.author = author;
        this.title = title;
        this.yearOfWriting = yearOfWriting;
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

    public int getYearOfWriting() {
        return yearOfWriting;
    }

    public void setYearOfWriting(int yearOfWriting) {
        this.yearOfWriting = yearOfWriting;
    }

    @Override
    public String toString() {
        return "Book{"
                + "author='"
                + author
                + '\''
                + ", title='"
                + title
                + '\''
                + ", yearOfWriting="
                + yearOfWriting
                + '}';
    }
}
