package ru.mirea.practice.s.task5;

import java.util.ArrayList;
import java.util.List;

public class DogKennel {
    private List<Dog> kennel;

    public void addDog(Dog dog) {
        kennel.add(dog);
    }

    public DogKennel(List<Dog> kennel) {
        this.kennel = kennel;
    }

    public DogKennel() {
        kennel = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Питомник, собаки в данный момент: " + kennel;
    }
}
