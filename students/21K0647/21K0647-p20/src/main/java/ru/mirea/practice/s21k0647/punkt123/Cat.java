package ru.mirea.practice.s21k0647.punkt123;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {
    boolean claw;

    Cat(String type, int age, boolean claw) {
        super(type, age);
        this.claw = claw;
    }

    @Override
    public String toString() {
        return type + "\tВозраст " + age + "\tКогти " + claw;
    }


}
