package ru.mirea.practice.task7;

public abstract class Learner {
    private final String fio;
    private final int age;

    public Learner(String fio, int age) {
        this.fio = fio;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }
}
