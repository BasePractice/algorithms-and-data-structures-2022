package ru.mirea.practice.task1;

import java.util.Scanner;

abstract class TestAuthor {
    public static void main(String[] args) {
        String name;
        String email;
        char gender = 'M';
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите имя автора: ");
            name = sc.next();
            System.out.print("Введите электронную почтуа втора: ");
            email = sc.next();
            Author author = new Author(name, email, gender);
            author.setName(name);
            author.setEmail(email);
            System.out.println("Имя автора: " + author.getName());
            System.out.println("Электронная почта автора: " + author.getEmail());
            System.out.println("пол автора: " + author.getGender());
        }
    }
}
