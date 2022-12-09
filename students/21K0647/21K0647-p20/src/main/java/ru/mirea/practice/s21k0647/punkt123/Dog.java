package ru.mirea.practice.s21k0647.punkt123;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
    String poroda;

    Dog(String type, int age, String poroda) {
        super(type, age);
        this.poroda = poroda;
    }

    @Override
    public String toString() {
        return type + "\tВозраст " + age + "\tПороды " + poroda;
    }


}
