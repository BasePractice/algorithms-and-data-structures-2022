package ru.mirea.practice.ex5;

public final class Tester {
    private Tester() {

    }

    public static void main(final String[] args) {
        DogKennel dk = new DogKennel();
        System.out.println(dk);

        Dog barsik = new Dog("Barsik", 8);
        Dog muhtar = new Dog("Muhtar", 4);
        System.out.println("Barsik in humane age: " + barsik.humanAge());
        System.out.println("Muhtar in humane age: " + muhtar.humanAge());

        Dog[] dogs = {barsik, muhtar};
        dk.add(dogs);
        System.out.println(dk);

    }
}
