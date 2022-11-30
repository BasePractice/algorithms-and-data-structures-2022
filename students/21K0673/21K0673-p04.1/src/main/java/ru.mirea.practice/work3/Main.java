package ru.mirea.practice.work3;

abstract class Main {
    public static void main(String[] args) {
        Person a = new Person("dsg", 23);
        Person b = new Person("Сергей Семёнович Шульц", 35);
        System.out.println(a + " " + b);
    }
}
