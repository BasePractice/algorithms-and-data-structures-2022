package ru.mirea.practice.n5;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
        name = "";
        age = 0;
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

    public int toHumanage() {
        return 7 * age;
    }

    @Override
    public String toString() {
        return "Dog{"
                +
                "name='" + name + '\''
                +
                ", age=" + age
                +
                '}';
    }

}
