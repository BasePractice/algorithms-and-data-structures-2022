package ru.mirea.practice.task2;

public class Person {
    private String name;
    private String surname;
    private String secondName;

    public Person(String name, String surname, String secondName) {
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String returnFio() {
        if (secondName == null) {
            return name + " " + surname;
        }
        if (surname == null) {
            return name;
        }
        return surname + " " + name + " " + secondName;
    }
}
