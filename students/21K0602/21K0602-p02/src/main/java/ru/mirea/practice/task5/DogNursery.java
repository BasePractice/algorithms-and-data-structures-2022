package ru.mirea.practice.task5;

import java.util.ArrayList;
import java.util.Scanner;

public class DogNursery {
    private final ArrayList<Dog> dogs;

    {
        dogs = new ArrayList<>();
    }

    public void add() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of dogs to add");
        int dogCount = in.nextInt();
        for (int i = 0; i < dogCount; i++) {
            dogs.add(new Dog(in.nextInt(), in.next()));
        }
        in.close();
    }

    public void showDogs() {
        for (Dog dog : dogs) {
            System.out.println(dog.toString());
        }
    }
}
