package ru.mirea.practice.s21K0688.task7;


import java.util.Scanner;

public class Tester7 {
    private static final int N = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] arrTemp = new Book[N];
        String authorTemp = new String();
        String nameTemp = new String();
        int yearTemp;
        for (int i = 0; i < arrTemp.length; i++) {
            Book temp1 = new Book(" ", 1, " ");
            System.out.print("Author: ");
            authorTemp = sc.nextLine();
            System.out.print("Name: ");
            nameTemp = sc.nextLine();
            System.out.print("Year: ");
            yearTemp = sc.nextInt();
            sc.nextLine();
            temp1.setAuthor(authorTemp);
            temp1.setName(nameTemp);
            temp1.setYear(yearTemp);
            arrTemp[i] = temp1;
        }
        Book temp2 = new Book(" ", 1, " ");
        temp2 = Bookshelf.earlyYear(arrTemp);
        System.out.print("MIN year: " + temp2.getYear() + " ");
        temp2 = Bookshelf.lastYear(arrTemp);
        System.out.println("MAX year: " + temp2.getYear());
        Bookshelf.increasing(arrTemp);
        System.out.print("Increasing: ");
        for (int i = 0; i < arrTemp.length; i++) {
            System.out.print(arrTemp[i].getYear() + " ");
        }
    }
}
