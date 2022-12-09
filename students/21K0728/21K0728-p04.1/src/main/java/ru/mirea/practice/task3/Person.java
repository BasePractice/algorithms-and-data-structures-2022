package ru.mirea.practice.task3;

public class Person {
    private String personName;
    private int personAge;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String move() {
        return personName + " Moves";
    }

    public String talk() {
        return personName + " Speaks";
    }

    public Person(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }

    public Person() {
        personName = "Unknown";
        personAge = 0;
    }
}