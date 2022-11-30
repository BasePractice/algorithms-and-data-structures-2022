package ru.mirea.worktwo.task1;

import java.util.Scanner;

public final class TestAuthor {
    private TestAuthor() {
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Author a = new Author("None", "None@example.com", 'm');
            System.out.println("Имя: " + a.getName());
            System.out.println("Введите почту");
            String f;
            f = sc.next();
            a.setEmail(f);
            System.out.println("Почта: " + a.getEmail());
            System.out.println("Пол: " + a.getGender());
        }
    }

}
