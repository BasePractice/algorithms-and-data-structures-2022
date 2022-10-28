package ru.mirea.practice.solutiontask5;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeToHuman() {
        return this.age / 7;
    }

    @Override
    public String toString() {
        return "Собака по кличке: " + this.name + ", возраст: " + this.age + ", 'человеческий' возраст: " + this.getAgeToHuman();
    }
}
