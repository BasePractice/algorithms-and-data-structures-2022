package ru.mirea.practice.task5;

public abstract class Main {
    public static void main(String[] args) {
        DogNursery dogs = new DogNursery();

        dogs.add();
        dogs.showDogs();
        Dog.dogtoHumanAge(7);
    }
}
