package ru.mirea.practice.task1;

public abstract class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Anna A", "12345h@mail.ru", 'F');
        a.setEmail("12345h@mail.ru");
        System.out.println(a);
        System.out.println("name: " + a.getName() + "; email: " + a.getEmail() + "; gender: " + a.getGender());
    }
}