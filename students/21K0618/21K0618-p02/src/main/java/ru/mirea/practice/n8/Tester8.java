package ru.mirea.practice.n8;

abstract class Tester8 {
    public static void main(String[] args) {
        String[] strings = {"1", "2", "3", "4", "5", "6", "7"};
        String bufer = new String();
        for (int i = 0; i < strings.length / 2; i++) {
            bufer = strings[i];
            strings[i] = strings[strings.length - i - 1];
            strings[strings.length - i - 1] = bufer;
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
