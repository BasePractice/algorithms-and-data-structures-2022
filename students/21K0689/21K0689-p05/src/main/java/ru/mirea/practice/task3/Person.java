package ru.mirea.practice.task3;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        System.out.println("Undefined person");
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String move(Person person) {
        return "Такой-то " + person + "идет";
    }

    public String talk(Person person) {
        return "Такой-то " + person + "говорит";
    }

    @Override
    public String toString() {
        return "Person {" + getFullName() + ", age " + getAge() + "} ";
    }


}
