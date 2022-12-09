package ru.mirea.practice.task2and3;

import ru.mirea.practice.task3.Adress;

public abstract class Main {
    public static void main(String[] args) {
        Person person = new Person("Rodion", "Zheleznyakov", null,
                new Adress("Russia, Moscow, NN ,123 , 4, 9"));
        System.out.println(person.getFio());
        System.out.println(person.getAddress());
    }
}
