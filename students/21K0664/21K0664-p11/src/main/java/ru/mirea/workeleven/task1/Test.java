package ru.mirea.workeleven.task1;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Test {

    static String fio() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Введите ФИО ");
            String fio = in.nextLine();
            System.out.println("Ваше ФИО " + fio);
            return fio;
        } catch (InputMismatchException e) {
            System.out.println("Error");
            in.nextInt();
        } finally {
            in.close();
        }
        return " ";
    }


    static Date datestart() {
        Date datestart = new Date();
        datestart.getDate();
        System.out.println("Дата начала задания " + datestart);
        return datestart;
    }

    static Date datefinsh() {
        Date datefinsh = new Date();
        Long time = datefinsh.getTime();
        long anotherDate = +7;
        time = time + (60 * 60 * 24 * 1000 * anotherDate);
        datefinsh = new Date(time);
        System.out.println("Дата конца задания " + datefinsh);
        return datefinsh;
    }

    public static void main(String[] args) {
        fio();
        datestart();
        datefinsh();

    }
}


