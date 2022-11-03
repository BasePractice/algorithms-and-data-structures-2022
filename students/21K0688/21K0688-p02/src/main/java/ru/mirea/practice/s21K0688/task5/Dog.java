package ru.mirea.practice.s21K0688.task5;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int ageDogToHuman(int ageDog) {
        return ageDog * 7;
    }

    @Override
    public String toString() {
        return "name: " + name +
                "age: " + age;
    }
}
