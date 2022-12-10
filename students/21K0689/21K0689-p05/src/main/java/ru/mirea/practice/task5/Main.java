package ru.mirea.practice.task5;

import java.time.Year;

public abstract class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Mike Johnson", "113245", "2", Year.of(2003), "12341412");
        System.out.println(reader.takeBook(3));
        reader.takeBook("Алиса в стране чудес", "Ведьмак", "Мастер и Маргарита");
        System.out.println();
        Book book1 = new Book("Капитанская дочка", "А.С. Пушкин");
        reader.takeBook(book1);
        System.out.println();
        System.out.println(reader.returnBook(2));
        reader.returnBook("Война и мир", "Собачье сердце");
        System.out.println();
        Book book2 = new Book("Отцы и дети", "И.С. Тургенев");
        reader.returnBook(book2);
    }
}
