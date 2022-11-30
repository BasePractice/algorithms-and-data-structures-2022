package ru.mirea.practice.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DogNursery {

    private final List<Dog> dogs = new ArrayList<>();

    public void add() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter number of dogs to add");
            int dogCount = in.nextInt();
            for (int i = 0; i < dogCount; i++) {
                dogs.add(new Dog(in.nextInt(), in.next()));
            }
        }
    }

    public void showDogs() {
        for (Dog dog : dogs) {
            System.out.println(dog.toString());
        }
    }
}
