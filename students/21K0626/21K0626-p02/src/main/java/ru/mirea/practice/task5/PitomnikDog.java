package ru.mirea.practice.task5;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class PitomnikDog {
    Dog[] array = new Dog[5];

    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public void addDog() {

        for (int i = 0; i < this.array.length; i++) {
            System.out.println("Имя и возраст собаки номер " + (i + 1));
            String nameD = sc.next();
            int ageD = sc.nextInt();
            this.array[i] = new Dog(nameD, ageD);
        }
    }

    @Override
    public String toString() {
        return "PitomnikDog{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
