package ru.mirea.practice1.s21k0647;


import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        Author k1 = new Author(source.nextLine(), source.nextLine(), source.next().charAt(0));
        System.out.print(k1.toString());
    }
}
