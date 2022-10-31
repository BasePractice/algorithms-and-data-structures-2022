package ru.mirea.practice.task7;

public class Book implements Comparable<Book> {
    private final String name;
    private final int date;
    private final String author;

    Book() {
        name = null;
        date = 0;
        author = null;
    }

    public Book(String name, int date, String author) {
        this.name = name;
        this.date = date;
        this.author = author;
    }

    public String getName() {
        return name;
    }


    public int getDate() {
        return date;
    }


    public String getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return "Book{"
                + "Name='"
                + name
                + '\''
                + ", Date="
                + date
                + ", Author='"
                + author
                + '\''
                + '}';
    }

    @Override
    public int compareTo(Book o) {
        return o.date >= date ? -1 : 0;
    }

    public void setName() {
    }
}
