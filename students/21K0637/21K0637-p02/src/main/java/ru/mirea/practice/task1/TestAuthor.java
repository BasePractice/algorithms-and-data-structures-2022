package ru.mirea.practice.task1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Anton", "antonshka@gmail.com", "male");
        System.out.println(author);
        System.out.println("Name " + author.getName());
        System.out.println("Email " + author.getEmail());
        System.out.println("Gender " + author.getGenger());
    }
}
