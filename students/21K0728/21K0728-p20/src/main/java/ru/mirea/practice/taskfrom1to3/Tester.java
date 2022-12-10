package ru.mirea.practice.taskfrom1to3;

public abstract class Tester {
    public static void main(String[] args) {
        GenericBox<String, Animal, Integer> genBox = new GenericBox<>("Hello White Linden!!!",
                new Cow("Cow", "White Linden"),
                5);

        genBox.names();
        System.out.println("\n" + genBox);
    }
}
