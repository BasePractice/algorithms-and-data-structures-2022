package ru.mirea.practice.task8;

public abstract class Main {
    public static void main(String[] args) {
        String[] strings = new String[10];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "*";
            for (int j = 0; j < i; j++) {
                strings[i] += "*";
            }
        }
        for (String string : strings) {
            System.out.print(string + " ");
        }
        System.out.println(" ");

        int lengtharray = strings.length;
        String temp;
        for (int i = 0; i < lengtharray / 2; i++) {
            temp = strings[lengtharray - i - 1];
            strings[lengtharray - i - 1] = strings[i];
            strings[i] = temp;
        }
        for (String string : strings) {
            System.out.print(string + " ");
        }
        System.out.println(" ");

    }
}
