package ru.mirea.practice.task5;

import java.util.Scanner;

public class DogTester {

    public void addDogs(Dog[] dog) {
        for (int i = 0; i < dog.length; i++) {
            try (Scanner in = new Scanner(System.in)) {
                System.out.println("Введите возраст: ");
                int age = in.nextInt();
                System.out.println("Введите имя: ");
                String name = in.next();
                Dog newDog = new Dog(age, name);
                dog[i] = newDog;
                System.out.println(dog[i].toString());
            }
        }
    }

}

