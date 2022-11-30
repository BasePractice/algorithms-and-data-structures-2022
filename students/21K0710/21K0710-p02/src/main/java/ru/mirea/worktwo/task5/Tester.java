package ru.mirea.worktwo.task5;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {

        Dog a = new Dog("A", 4);
        Dog b = new Dog("B", 5);
        Dog c = new Dog("C", 1);
        Dog d = new Dog("D", 10);
        Dog e = new Dog("E", 6);
        DogShelter dogShelter = new DogShelter(20);
        dogShelter.addDogs(a);
        dogShelter.addDogs(a, b);
        dogShelter.addDogs(a, b, c);
        dogShelter.addDogs(a, b, c, d);
        dogShelter.addDogs(a, b, c, d, e);
        int n = 20;
        for (int i = 0; i < n; i++) {
            System.out.println(dogShelter.arrDog[i]);
        }
    }
}
