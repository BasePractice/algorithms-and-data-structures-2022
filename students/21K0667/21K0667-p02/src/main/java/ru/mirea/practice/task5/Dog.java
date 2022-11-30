package ru.mirea.practice.task5;

public class Dog {
    private int age;
    private String name;

    public Dog(int page, String pname) {
        age = page;
        name = pname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int humanAge() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Age:" + age + ", Name: " + name + ", Human age: " + humanAge();
    }

}

