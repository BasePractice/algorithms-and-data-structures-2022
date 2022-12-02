package ru.mirea.practice.subchapter.task5;

import java.util.Scanner;

public final class Test {
    private Test() {

    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Reader reader = new Reader();
        System.out.println(reader.toString());
        Book[] arr = new Book[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Book(new Scanner(System.in).nextLine());
        }
        Reader r = new Reader(3, 321, "Aboba", "ohrana", "28.09.2029");
        r.takeBook(arr);
    }
}
