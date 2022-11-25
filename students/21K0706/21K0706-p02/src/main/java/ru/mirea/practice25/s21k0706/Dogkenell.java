package ru.mirea.practice25.s21k0706;

import java.util.ArrayList;

public final class Dogkenell {
    private Dogkenell() {

    }

    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        Dog d1 = new Dog("Sharik",5);
        dogs.add(d1);
        Dog d2 = new Dog("Pirat",8);
        dogs.add(d2);
        for (Dog a: dogs) {
            System.out.println(a.toString());
        }
        System.out.println("Human age of first dog: " + dogs.get(0).humanAge());
    }
}
