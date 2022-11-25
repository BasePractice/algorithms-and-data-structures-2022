package ru.mirea.practice.solutiontask7;

public class Book {
    private String author;
    private String name;
    private String about;
    private int year;

    public Book(String author, String name, String about, int year) {
        this.year = year;
        this.name = name;
        this.about = about;
        this.author = author;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAbout() {
        return about;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Автор: " + this.author + "\n Название книги: " + this.name + "\n Описание книги: " + this.about + "Год написания: " + this.year;
    }
}
