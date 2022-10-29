package ru.mirea.practice.task5;

public class Dog {
    private String name;

    private  int age;

    public  Dog(String name,int age) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int humanAge() {
        return this.age * 8;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}
