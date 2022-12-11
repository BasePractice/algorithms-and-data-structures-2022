package ru.mirea.practice.task1;

abstract class Main {
    public static void main(String[] args) {
        Client c = new Client();
        c.requestNameAndItn("12345");
        c.requestNameAndItn("10000");
    }
}
