package ru.mirea.practice.solutiontask1;

import java.util.Scanner;

public final class TestAuthor {
    private TestAuthor() {}

    private static final Scanner sc = new Scanner(System.in);

    public static String finishname() {
        System.out.print("Введите имя: ");
        return sc.nextLine();
    }

    public static String finishemail() {
        System.out.print("Введите эл. почту: ");
        String emailinput = sc.next();
        while ("@".contains(emailinput)) {
            System.out.print("Введите снова эл. почту: ");
            emailinput = sc.next();
        }
        return emailinput;
    }

    public static char finishgender() {
        System.out.print("Введите пол (м или ж): ");
        return Character.toLowerCase(sc.next().charAt(0));
    }

    public static void main(String[] args) {
        Author test = new Author(finishname(), finishemail(), finishgender());
        System.out.println(test);
        System.out.println(test.getEmail());
        test.setEmail(finishemail());
        System.out.println(test.getEmail());
        System.out.println(test);

        System.out.println(test.getName());
        System.out.println(test.getGender());
    }
}
