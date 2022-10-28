package ru.mirea.practice.work7;

abstract class BookTest {
    public static void main(String[] args) {
        Book a = new Book("Лев Николаевич Толстой", "Война и Мир", 1865);
        System.out.println(a);
        a.setAuthor("Л.Н.Толстой");
        System.out.println(a.getAuthor());
        Book b = new Book("А.С.Пушкин", "Евгений Онегин", 1825);
        Bookshelf c = new Bookshelf(2);
        c.setShelf(a, 0);
        c.setShelf(b, 1);
        System.out.println(c);
        System.out.println(c.getAmount());
        System.out.println(c.getFirstYear());
        System.out.println(c.getLastYear());
        c.sort();
        System.out.println(c);
        System.out.println(a.getName());
        a.setName("tie");
        a.setYear(1735);
        System.out.println(c.getShelf()[0]);
        System.out.println(c.getAmount());
        c.setAmount(2);
    }
}
