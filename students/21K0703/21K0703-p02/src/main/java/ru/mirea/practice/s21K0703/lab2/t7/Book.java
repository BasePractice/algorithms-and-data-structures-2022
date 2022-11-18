package ru.mirea.practice.s21K0703.lab2.t7;

public class Book {
    private String author;
    private String name;
    private int publicationDate;

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

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Book(String author, String name, int publicationDate) {
        this.author = author;
        this.name = name;
        this.publicationDate = publicationDate;
    }

    public Book(String name, int publicationDate) {
        this.name = name;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "{'" + author + '\''
                + ", '" + name + '\''
                + ", Дата издания: " + publicationDate
                + '}';
    }
}