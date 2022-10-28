package ru.mirea.practice.work5;

abstract class Main {
    public static void main(String[] args) {
        String strings = "+79123456789";
        String string = "89123456789";
        TelephoneNumber telephonenumber = new TelephoneNumber(strings);
        TelephoneNumber number = new TelephoneNumber(string);
        System.out.println(telephonenumber);
        System.out.println(number);
    }
}
