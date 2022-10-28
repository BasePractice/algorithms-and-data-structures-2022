package ru.mirea.practice21.s21k0706;

//import java.lang.*;

public final class TestAuthor {
    private TestAuthor() {

    }

    public static void main(String[] args) {
        Author person1 = new Author("Vova", "vovan@mail.ru", 'm');
        System.out.println(person1.toString());
    }
}
