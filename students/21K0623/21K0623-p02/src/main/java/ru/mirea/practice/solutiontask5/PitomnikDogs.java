package ru.mirea.practice.solutiontask5;

import java.util.Scanner;

public class PitomnikDogs {
    private final Dog[] dogs;

    public PitomnikDogs(Dog[] dogs) {
        this.dogs = dogs;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        for (Dog dog : this.dogs) {
            info.append(dog.toString()).append('\n');
        }
        return info.toString();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите кол-во собак");
            int temp = sc.nextInt();
            Dog[] dogs = new Dog[temp];

            for (int i = 0; i < temp; i++) {
                System.out.println("Введите имя собаки");
                String namedog = sc.next();
                System.out.println("Введите возраст собаки");
                int agedog = sc.nextInt();
                dogs[i] = new Dog(namedog, agedog);
            }

            PitomnikDogs object = new PitomnikDogs(dogs);
            System.out.println(object);
        }
    }
}
