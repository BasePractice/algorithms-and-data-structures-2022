package ru.mirea.practice.task3;

abstract class Main {
    public static void main(String[] args) {
        File file = new File();
        file.neew("Text.txt");
        file.open("Text.txt");
        file.save();
        file.exit();
    }
}
