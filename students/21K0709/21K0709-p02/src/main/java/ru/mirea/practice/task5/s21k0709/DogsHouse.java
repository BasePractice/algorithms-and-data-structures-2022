package ru.mirea.practice.task5.s21k0709;

import java.util.ArrayList;

public class DogsHouse {
    private ArrayList<Dog> dogs = new ArrayList<Dog>();

    public void addDog(Dog obj) {
        dogs.add(obj);
    }

    public ArrayList<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(ArrayList<Dog> dogs) {
        this.dogs = dogs;
    }

    public String toString() {
        return "Массив собак:" + dogs;
    }
}
