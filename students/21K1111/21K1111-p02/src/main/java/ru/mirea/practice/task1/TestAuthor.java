package ru.mirea.practice.task1;

public abstract class TestAuthor {
    public static void main(String[] a) {
        Author author = new Author("Bill Gates", "realbillgates@omg.ru", 'm');
        System.out.print(author);
    }
}
