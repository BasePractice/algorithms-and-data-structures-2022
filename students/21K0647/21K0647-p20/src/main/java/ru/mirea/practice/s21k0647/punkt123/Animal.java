package ru.mirea.practice.s21k0647.punkt123;

public abstract class Animal {
    int age;
    String type;

    Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Животное " + type + "\tВозраст " + age;
    }
}
