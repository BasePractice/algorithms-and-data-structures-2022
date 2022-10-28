package ru.mirea.practice210.s21k0706.s21k0706;

public class Book {
    private String author;
    private String title;
    private int writingyear;
    private int publicationyear;
    private int circulation;

    public Book(String author, String title, int writingyear, int publicationyear, int circulation) {
        this.author = author;
        this.title = title;
        this.writingyear = writingyear;
        this.publicationyear = publicationyear;
        this.circulation = circulation;
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

    public int getWritingyear() {
        return writingyear;
    }

    public void setWritingyear(int writingyear) {
        this.writingyear = writingyear;
    }

    public int getPublicationyear() {
        return publicationyear;
    }

    public void setPublicationyear(int publicationyear) {
        this.publicationyear = publicationyear;
    }

    public int getCirculation() {
        return circulation;
    }

    public void setCirculation(int circulation) {
        this.circulation = circulation;
    }

}
