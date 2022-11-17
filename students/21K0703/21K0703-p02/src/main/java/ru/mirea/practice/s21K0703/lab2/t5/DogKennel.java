package ru.mirea.practice.s21K0703.lab2.t5;

import java.util.ArrayList;

public class DogKennel {
    private ArrayList<Dog> kennel = new ArrayList<>();

    public void addDog(Dog dog) {
        kennel.add(dog);
    }

    public DogKennel(ArrayList<Dog> kennel) {
        this.kennel = kennel;
    }

    public DogKennel() {
    }

    @Override
    public String toString() {
        return "Питомник, собаки в данный момент: " + kennel;
    }
}