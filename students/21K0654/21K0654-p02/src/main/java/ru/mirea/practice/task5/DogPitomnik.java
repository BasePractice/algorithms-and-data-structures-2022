package ru.mirea.practice.task5;

import java.util.Scanner;

public class DogPitomnik {
    private Dog[] dogs;

    public DogPitomnik(Dog[] k) {
        this.dogs = k;
    }

    public void addDogs(Dog[] k) {
        Dog[] newDogs = new Dog[this.dogs.length + k.length];

        int j = 0;

        for (int i = 0; i < newDogs.length; i++) {
            if (i < this.dogs.length) {
                newDogs[i] = dogs[i];
            } else {
                newDogs[i] = k[j];
                j++;
            }
        }

        this.dogs = newDogs;
    }

    @Override
    public String toString() {
        String s = "ToString: ";

        for (int i = 0; i < this.dogs.length; i++) {
            s += this.dogs[i].toString() + "; ";
        }

        return s;
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Dog[] dogs1 = new Dog[2];
        Dog[] dogs2 = new Dog[3];
        for (int i = 0; i < dogs1.length; i++) {
            dogs1[i] = new Dog(sc.nextLine(), sc.nextInt());
            sc = new Scanner(System.in);
        }
        for (int i = 0; i < dogs2.length; i++) {
            dogs2[i] = new Dog(sc.nextLine(), sc.nextInt());
            sc = new Scanner(System.in);
        }
        DogPitomnik dp = new DogPitomnik(dogs1);
        dp.addDogs(dogs1);
        System.out.println(dp);
        dp.addDogs(dogs2);
        System.out.println(dp);
    }
}
