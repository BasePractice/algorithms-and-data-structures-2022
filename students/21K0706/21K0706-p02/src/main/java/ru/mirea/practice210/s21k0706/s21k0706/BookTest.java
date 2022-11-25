package ru.mirea.practice210.s21k0706.s21k0706;

public final class BookTest {
    private BookTest() {

    }

    public static void main(String [] args) {
        Book b1 = new Book("Pushkin", "Eugene Onegin", 1830, 2010, 1000);
        Book b2 = new Book("Goncharov", "Oblomov", 1859, 2020, 200);
        Book b3 = new Book("Gogol", "Dead souls", 1852, 1996,2105);
        BookShelf shelf = new BookShelf(3);
        shelf.add(b1);
        shelf.add(b2);
        shelf.add(b3);
        System.out.println(shelf.less());
        System.out.println(shelf.more());
    }
}
