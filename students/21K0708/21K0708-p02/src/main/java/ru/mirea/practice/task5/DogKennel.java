package ru.mirea.practice.task5;

import java.util.List;

public class DogKennel {
    private List<Dog> dogs;

    public void addDogs(List<Dog> dogs) {
        for (Dog dog: dogs) {
            this.dogs.add(dog);
        }
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }
}
