package ru.mirea.practice.work3;

abstract class Main {
    public static void main(String[] args) {
        File file = new File();
        file.newe("Text.txt");
        file.open("Text.txt");
        file.save();
        file.exit();
    }
}
