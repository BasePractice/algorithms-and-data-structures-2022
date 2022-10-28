package ru.mirea.practice.task7;

public class Pupil extends Learner {
    private final int level;

    public Pupil(String fio, int age, int level) {
        super(fio, age);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Pupil " + super.getFio() + " age " + super.getAge() + "level=" + level;
    }
}
