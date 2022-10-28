package ru.mirea.workfourone.task7;

public class Learner {
    private String name;
    private String number;
    private double averageMark;

    public Learner(String name, String number, double averageMark) {
        this.name = name;
        this.number = number;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Learner{" + "name='" + name + '\'' + ", number='" + number + '\'' + ", averageMark=" + averageMark + '}';
    }
}
