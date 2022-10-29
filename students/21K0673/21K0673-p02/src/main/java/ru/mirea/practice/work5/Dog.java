package ru.mirea.practice.work5;

public class Dog {
    private double age;
    private String name;

    Dog(double age, String name) {
        this.age = age;
        this.name = name;
    }

    public double getAge() {
        return this.age;
    }

    public double getInHuAge() {
        return (this.age) * 7;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAgeName(double age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "{" + "Возраст = " + age + ", Кличка: " + name + "}";
    }
}
