package ru.mirea.practice.task7;

public class Schoolchild extends Pupil {
    private final int level;

    public Schoolchild(String firstName, String lastName, int age, int level) {
        super(firstName, lastName, age);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return super.getAllName()
            + ", age: " + super.getAge()
            + ", level: " + level + ";";
    }
}
