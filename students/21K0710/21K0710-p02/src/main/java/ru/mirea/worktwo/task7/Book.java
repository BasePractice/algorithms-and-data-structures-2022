package ru.mirea.worktwo.task7;

public class Book {
    String author;
    String name;
    int date;

    public Book(String author, String name, int date) {
        this.author = author;
        this.name = name;
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" + "author='" + author + '\'' + ", name='" + name + '\'' + ", date=" + date + '}';
    }
}
