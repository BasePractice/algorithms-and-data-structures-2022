package ru.mirea.practice.s21K0688.task1;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Author a1 = new Author("Ivan", "ivan1993@gmail.com", 'M');
        System.out.println(a1.toString());

        System.out.print("New email: ");
        String newEmail = sc.nextLine();
        a1.setEmail(newEmail);
        System.out.println(a1.toString());
    }
}
