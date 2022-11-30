package ru.mirea.practice.tasks5to6;

public abstract class Main {
    public static void main(String[] args) {
        ProcessStrings processStrings = new ProcessStrings("MIREA");
        System.out.println(processStrings.length());
        System.out.println(processStrings.substring());
        System.out.println(processStrings.reverse());
    }
}
