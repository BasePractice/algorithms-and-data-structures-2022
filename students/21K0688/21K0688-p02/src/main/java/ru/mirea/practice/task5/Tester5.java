package ru.mirea.practice.task5;

import java.util.Scanner;

abstract class Tester5 {
    private static final int N = 3;

    public static void addDogs(Dog[] arr) {
        String name = new String();
        int age;
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Name: ");
                name = sc.nextLine();
                System.out.print("Age: ");
                age = sc.nextInt();
                sc.nextLine();
                Dog dogTemp = new Dog(name, age);
                arr[i] = dogTemp;
            }
        }
    }

    public static void main(String[] args) {
        Dog[] arr = new Dog[N];
        addDogs(arr);
        for (Dog dog : arr) {
            System.out.print(dog.getName() + " - " + dog.getAge() + " dog age => " + Dog.ageDogToHuman(dog.getAge()) + " human age");
            System.out.print("\n");
        }
    }
}
