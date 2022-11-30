package ru.mirea.practice.task7;

public class Pupil {
    private final String firstName;
    private final String lastName;
    private final int age;

    public Pupil(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getAllName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }
}
