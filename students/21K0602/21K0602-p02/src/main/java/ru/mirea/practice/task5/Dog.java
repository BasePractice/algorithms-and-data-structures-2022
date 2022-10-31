package ru.mirea.practice.task5;

public class Dog {
    private String name;
    private int age;

    public Dog() {
        age = 0;
        name = "None";
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static int DogtoHumanAge(int DogAge) {
        return DogAge * 7;
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

    @Override
    public String toString() {
        return "Dog{" +
                "Name='" + name + '\'' +
                ", Age=" + age +
                '}';
    }
}
