package ru.mirea.practice.ex7;

public final class BookTest {
    private BookTest() {

    }

    public static void main(final String[] args) {
        Book book = new Book("Bulgakov", "Master and Margarita", 1928);
        System.out.println(book);
        System.out.println("author: " + book.getAuthor());
        System.out.println("name: " + book.getName());
        System.out.println("year: " + book.getYear());

        book.setName("Crime and punishment");
        book.setAuthor("Dostoevsky");
        book.setYear(1866);

        System.out.println("After book.setName('Crime and punishment'); \n\tbook.setAuthor('Dostoevsky'); \n\tbook.setYear(1866);");
        System.out.println(book);
        System.out.println("author: " + book.getAuthor());
        System.out.println("name: " + book.getName());
        System.out.println("year: " + book.getYear());
    }
}
