package ru.mirea.workfourone.task7;

public class Schoolboy extends Learner {
    private String grade;

    public Schoolboy(String name, String number, double averageMark, String grade) {
        super(name, number, averageMark);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Schoolboy{" + super.toString() + "grade='" + grade + '\'' + '}';
    }
}
