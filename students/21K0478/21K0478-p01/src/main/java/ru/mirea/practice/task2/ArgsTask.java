package ru.mirea.practice.task2;

abstract class ArgsTask {
    public static void main(String[] args) {
        for (String el : args) {
            System.out.println(el);
        }
    }
}
