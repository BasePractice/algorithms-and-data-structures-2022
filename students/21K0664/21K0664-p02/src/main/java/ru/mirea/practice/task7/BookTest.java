package ru.mirea.practice.task7;

public class BookTest {
    public static void main(String[] args) {
        Book a = new Book("Лев Николаевич Толстой", "Война и Мир", 1865);
        System.out.println(a.toString());
        a.setAuthor("Л.Н.Толстой");
        System.out.println(a.getAuthor());
        Book b = new Book("А.С.Пушкин", "Евгений Онегин", 1825);
        BookShelf c = new BookShelf(2);
        c.setShelf(a,0);
        c.setShelf(b,1);
        System.out.println(c.toString());
        System.out.println(c.getAmount());
        System.out.println(c.getFirstYear());
        System.out.println(c.getLastYear());
        c.sort();
        System.out.println(c.toString());
    }
}